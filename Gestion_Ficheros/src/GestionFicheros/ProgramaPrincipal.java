package GestionFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		File fichero1 = null;
		File fichero2 = null;
		File fichero3 = null;
		String rutaFichero1;
		String rutaFichero2;
		String rutaFichero3;
		String rutanuevoFichero;
		String textoIngresado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del fichero1");
		rutaFichero1 = sc.nextLine();
		fichero1 = new File(rutaFichero1);
		MostrarDetallesFichero(fichero1);
		
		
		
		System.out.println("Ingrese el nombre de un nuevo archivo, incluyendo la ruta para crearlo");
		rutanuevoFichero = sc.nextLine();
		File nuevoFichero = new File(rutanuevoFichero);
		
		if (nuevoFichero.exists()) {
			System.out.println("El fichero ya existe");
		}
		else {
			try {
				nuevoFichero.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		do {
			System.out.println("ingrese un texto al archivo");
			textoIngresado = sc.nextLine();
			EscribirAnchivo(textoIngresado, nuevoFichero);
			
		} while(!textoIngresado.equals("EOF"));
		
	}
	
	public static void MostrarDetallesFichero(File archivo){
		
		System.out.println("El nombre del fichero es: " + archivo.getName());
		System.out.println("La ruta del fichero es: " + archivo.getPath());
		System.out.println("El tamaño del fichero es: " + (archivo.length())/1024 + " kbytes");
		
	}
	
	public static void EscribirAnchivo(String texto, File archivoNuevo) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
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


}
