package CarritoCompras;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
	// 	pedir datos del producto y devuelve producto:
		Producto datosProd = datosIngresaUsuario();
	// Mostrar datos del producto necesita prodcreado devuelve nada,
		mostrarDatosProd(datosProd);
		
	
	}
	public static Producto datosIngresaUsuario() {
		Producto prodCreado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor ingrese los siguientes datos: ");
		System.out.println("ID del producto:");
		int id_Producto = Integer.parseInt(sc.nextLine());
		System.out.println("Nombre del producto");
		String nomProd = sc.nextLine();
		System.out.println("Precio del producto ");
		Double precioProd = Double.parseDouble(sc.nextLine());
		
		prodCreado = new Producto(id_Producto,nomProd, precioProd);
		
		return prodCreado;
	}
	
	public static void mostrarDatosProd(Producto nuevoProd) {
		System.out.println("Los datos son: " + nuevoProd.toString());
		
	}
	
}
