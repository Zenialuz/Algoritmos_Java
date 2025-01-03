package GestionVehiculos;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		// Creando los objetos por cada modelo de coche:
		cocheSUV SUV = new cocheSUV(100.5, 13000.5, "Rojo", 2000.9, "2345");
		CocheMercedes Mercedes = new CocheMercedes(120.8, 12000.5, "Gris", 600.5, "5678");
		CocheSeat Seat = new CocheSeat(90.8, 10000.5, "Azul", 3.5, "4567");
		
		//Mostrando los detalles de cada modelo de coche:
		System.out.println("Coche SUV: ");
		System.out.println(SUV.toString());
		System.out.println("Coche Mercedes: ");
		System.out.println(Mercedes);
		System.out.println("Coche Seat: ");
		System.out.println(Seat);
	}

}
