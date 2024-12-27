package Aviones;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		//Creando los 2 aviones, usando el constructor de la clase Avion.
		Avion avion1 = new Avion("AirbusA350", 32, 3890, "12/12/2024", "David Galvez de Canto");
		Avion avion2 = new Avion("AirbusA380", 41, 4890, "26/11/2024", "Zenia Canto");
		
		//Imprimiendo por consola la cabecera de los datos de los aviones.
		System.out.println( "Código \t Asientos\tKm \t Revisión \t Responsable"); 
		
		//Imprimiendo por consola los datos de los aviones creados.
		System.out.println(avion1.toString());
		System.out.println(avion2.toString());
		
	}

}
