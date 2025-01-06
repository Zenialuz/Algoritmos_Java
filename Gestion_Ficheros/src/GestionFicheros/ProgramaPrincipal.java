package GestionFicheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		File fichero1 = null;		
		String rutaFichero1;
		String rutaFichero2;	
		String rutanuevoFichero;
		String textoIngresado;
		File nuevoFichero;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del fichero1");
		rutaFichero1 = sc.nextLine();
		fichero1 = new File(rutaFichero1);
		
		gestionFicheros admin = new gestionFicheros();
		admin.MostrarDetallesFichero(fichero1);
		
		System.out.println("Ingrese el nombre de un nuevo archivo, incluyendo la ruta para crearlo");
		rutanuevoFichero = sc.nextLine();
		nuevoFichero = new File(rutanuevoFichero);
		
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
			admin.EscribirAnchivo(textoIngresado, nuevoFichero);
			
		} while(!textoIngresado.equals("EOF"));
		
		
		System.out.println("ingrese la ruta del archivo con los números a sumar");
		rutaFichero2=sc.nextLine();
		//abrir archivo -> devolver el archivo , necesito ruta del archivo
		File archiv = admin.abrirArchivo(rutaFichero2);
		
		//recorrer archivo-> devolver lista de textos, necesito el archivo
		ArrayList<String> textos = admin.recorrerArchivo(archiv);
		
		//extraer los numeros  -> lista de números necesito la lista de texto
		ArrayList<Integer> numeros = admin.extraerNumeros(textos);
		//sumarlos -> devolver numero, necesito la lista de numeros
		int sumaTotal = admin.sumaNumeros(numeros);
		
		System.out.println("La suma total de los números del archivo es: " + sumaTotal);
	}
	
}
