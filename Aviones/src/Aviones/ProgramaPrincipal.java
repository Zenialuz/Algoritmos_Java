package Aviones;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
						
		//Creando los 2 aviones, usando el constructor de la clase Avion.
		Avion avion1 = pedirDatosAvion();
		Avion avion2 = pedirDatosAvion();
		
		//Imprimiendo por consola la cabecera de los datos de los aviones.
		System.out.println( "Código \t Asientos\tKm \t Revisión \t Responsable"); 
		
		//Imprimiendo por consola los datos de los aviones creados.
		System.out.println(avion1.toString());
		System.out.println(avion2.toString());
		
	}
	
	public static Avion pedirDatosAvion(){
		Avion avion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Ingrese los siguientes datos del avion:");
		System.out.println( "Código:");
		String codigo = sc.nextLine();
		System.out.println( "Asientos disponibles:");
		int asientos = Integer.parseInt(sc.nextLine());
		System.out.println( "Km de autonomía:");
		double km = Double.parseDouble(sc.nextLine());
		System.out.println( "Fecha de revisión:");
		String fechaRevision = sc.nextLine();
		System.out.println( "Responsable de reparación:");
		String responsable = sc.nextLine();
		
		avion = new Avion(codigo, asientos, km, fechaRevision, responsable);
			
		return avion;	
	}

}
