package GestionFicheros;

import java.io.File;
import java.util.Scanner;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		
		File fichero1 = null;
		File fichero2 = null;
		File fichero3 = null;
		String rutaFichero1;
		String rutaFichero2;
		String rutaFichero3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la ruta del fichero1");
		rutaFichero1 = sc.nextLine();
		fichero1 = new File(rutaFichero1);
		MostrarDetallesFichero(fichero1);
		
		System.out.println("Ingrese la ruta del fichero 2");
		rutaFichero2 = sc.nextLine();
		fichero2 = new File(rutaFichero2);
		MostrarDetallesFichero(fichero2);
		
		System.out.println("Ingrese la ruta del fichero 3");
		rutaFichero3 = sc.nextLine();
		fichero3 = new File(rutaFichero3);
		MostrarDetallesFichero(fichero3);
		
	}
	
	public static void MostrarDetallesFichero(File archivo){
		
		System.out.println("El nombre del fichero es: " + archivo.getName());
		System.out.println("La ruta del fichero es: " + archivo.getPath());
		System.out.println("El tamaño del fichero es: " + (archivo.length())/1024 + " kbytes");
		
	}


}
