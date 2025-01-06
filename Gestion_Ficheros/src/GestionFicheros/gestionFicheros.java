package GestionFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class gestionFicheros {
	
	public gestionFicheros() {
		
	}
	
	public void MostrarDetallesFichero(File archivo){
		
		System.out.println("El nombre del fichero es: " + archivo.getName());
		System.out.println("La ruta del fichero es: " + archivo.getPath());
		System.out.println("El tamaño del fichero es: " + (archivo.length())/1024 + " kbytes");
		
	}
	
	public void EscribirAnchivo(String texto, File archivoNuevo) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		if(texto.equals("EOF")){
			return;
		}
		
		texto = validarEntero(texto);
		
		try {
			fw = new FileWriter(archivoNuevo, true);
			bw = new BufferedWriter(fw);
			bw.write(texto + "\n");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 try {
			 bw.close();
			 fw.close();
			
		} catch (IOException e) {
			System.out.println("Error al Cerrar el fichero");//Se imprime el mensaje en la consola
			e.printStackTrace();
		}
		
	}
	
	public boolean esEntero(String numero){
		
		/* Aplicamos try catch para el control de errores, así asegurarse que el valor que 
		 * esta ingresando el usuario se puede convertir o no a número entero.
		 */
		
	    try{
	        Integer.parseInt(numero);
	        return true;
	    }catch(NumberFormatException e){
	        return false;
	    }
	}
	
	public boolean esDouble(String numero){
		
	    try{
	        Double.parseDouble(numero);
	        return true;
	    }catch(NumberFormatException e){
	        return false;
	    }
	}
	public String validarEntero(String texto) {
		
		String valorRetornado;
		
		if(esDouble(texto)) {
			Double valorNumero =Double.parseDouble(texto);
			valorRetornado = valorNumero.intValue() + "";
		}
		else {
			valorRetornado =texto;
		}		
		
		return valorRetornado;
	}
	
	public int convertiraEntero(String texto) {
		
		int valorRetornado;
		
		if(esDouble(texto)) {
			Double valorNumero =Double.parseDouble(texto);
			valorRetornado = valorNumero.intValue();
		}
		else {
			valorRetornado = 0;
		}		
		
		return valorRetornado;
	}
	
	//abrir archivo -> devolver el archivo , neccesito ruta del archivo
	//recorrer archivo-> devolver lista de textos, necesito el archivo
	//extraer los numeros  -> lista de números necesito la lista de texto
	//sumarlos -> devolver numero, necesito la lista de numeros
	
	
	public File abrirArchivo(String rutaArchivo) {
		File archivo;
		archivo = new File(rutaArchivo);
		return archivo;
	}
	
	public ArrayList<String> recorrerArchivo(File archivo){
		
		ArrayList<String> listaTextos = new ArrayList<>();
		String linea;
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			
			linea = br.readLine();
			while(linea != null) {
				listaTextos.add(linea);
				linea = br.readLine();
			}
			 
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		 try {
			 br.close();
			 fr.close();
			
		} catch (IOException e) {
			System.out.println("Error al Cerrar el fichero");//Se imprime el mensaje en la consola
			e.printStackTrace();
		}
		
		
		return listaTextos;
		
	}
	public ArrayList<Integer> extraerNumeros(ArrayList<String> listaTextos){
		ArrayList<Integer> listaNumeros = new ArrayList<>();;
		int numEntero;
		
		for(int i = 0; i<listaTextos.size(); i++) {
			
			numEntero = convertiraEntero(listaTextos.get(i));
			listaNumeros.add(numEntero);
		}
		
		return listaNumeros;
	}
	
	public int sumaNumeros(ArrayList<Integer> listaNumeros) {
		int suma = 0;
		for(int i = 0; i < listaNumeros.size(); i++) {
			
			suma = suma + listaNumeros.get(i); //obteniendo la suma de elementos de un arraylist de numeros
		}
		
		return suma;
		
	}

}
