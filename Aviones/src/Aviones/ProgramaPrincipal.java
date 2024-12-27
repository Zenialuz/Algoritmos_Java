package Aviones;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Avion avion1 = new Avion("AirbusA350", 32, 3890, "12/12/2024", "David Galvez de Canto");
		Avion avion2 = new Avion("AirbusA380", 41, 4890, "26/11/2024", "Zenia Canto");
		
		System.out.println( "Código \t Asientos\tKm \t Revisión \t Responsable"); 
		System.out.println(avion1.toString());
		System.out.println(avion2.toString());
		
	}

}
