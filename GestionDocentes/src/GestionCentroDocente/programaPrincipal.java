package GestionCentroDocente;

import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		//Creando los 3 docentes, usando el constructor de la clase Docente.
		Docente docente1 = pedirDatosDocente();
		Docente docente2 = pedirDatosDocente();
		Docente docente3 = pedirDatosDocente();
		
		//Imprimiendo por consola los datos de los docentes creados.
		mostrarDatosDocentes(docente1,docente2, docente3);
		
		
		System.out.println("Quieres modificar los datos de algun docente?");
		System.out.println("1: Modificar los datos del docente 1");
		System.out.println("2: Modificar los datos del docente 2");
		System.out.println("3: Modificar los datos del docente 3");
		System.out.println("4: No Modificar");
		
		//captura la opcion elegida por el usuario
		int modificado = Integer.parseInt(sc.nextLine());
		
		switch (modificado) {
			
			case 1:
				modificarDatoDocente(docente1);
				break;
			case 2:
				modificarDatoDocente(docente2);
				break;
			case 3:
				modificarDatoDocente(docente3);
				break;
		}
		//muestra los datos modificados de los docentes:
		mostrarDatosDocentes(docente1,docente2, docente3);
	}
	
	//Función que muestra los datos de los docentes
	public static void mostrarDatosDocentes(Docente docente1, Docente docente2, Docente docente3) {
		
		//Imprimiendo por consola la cabecera de los datos de los aviones.
		System.out.println( "Nombre \tAp Pat\tAp Mat \t DNI\t Correo \t Titulo \t Materia \tDirección\t Teléfono");
		System.out.println(docente1.toString());
		System.out.println(docente2.toString());
		System.out.println(docente3.toString());
	}
	public static Docente pedirDatosDocente() {
		Docente docente;
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Ingrese los siguientes datos del docente:");
		System.out.println( "Nombre:");
		String nombre = sc.nextLine();
		System.out.println( "Apellido paterno:");
		String apPaterno = sc.nextLine();
		System.out.println( "Apellido materno:");
		String apMaterno = sc.nextLine();
		System.out.println( "DNI:");
		String dni = sc.nextLine();
		System.out.println( "Quiere ingresar datos adicionales?:");
		System.out.println( "1: SI");
		System.out.println( "2: No");
		int datosAdicionales = Integer.parseInt(sc.nextLine());
		
		if (datosAdicionales == 1) {
			System.out.println( "Ingrese los siguientes los datos adicionales:");
			System.out.println( "Correo electrónico:");
			String correo = sc.nextLine();
			System.out.println( "Titulación:");
			String titulacion = sc.nextLine();
			System.out.println( "Materia que imparte:");
			String materia = sc.nextLine();
			System.out.println( "Dirección:");
			String direccion = sc.nextLine();
			System.out.println( "Teléfono:");
			String telefono = sc.nextLine();
			
			docente = new Docente(nombre, apPaterno, apMaterno, dni, correo, titulacion, materia, direccion, telefono);
			
		}
		else {
			docente = new Docente(nombre, apPaterno, apMaterno, dni);
			
		}
		
		return docente;
	}
	
	public static void modificarDatoDocente(Docente docente) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Que dato deseas modificar:");
		System.out.println("1: correo electrónico");
		System.out.println("2: titulación");
		System.out.println("3: Materia");
		System.out.println("4: Dirección");
		System.out.println("5: Telefono");
		
		int nuevoDato = Integer.parseInt(sc.nextLine());
		
		switch(nuevoDato){
		
			case 1:
				System.out.println("El correo actual es:" + docente.getcorreoElectronico());
				System.out.println("Ingrese nuevo correo:");				
				docente.setcorreoElectronico(sc.nextLine());
				break;
				
			case 2:	
				System.out.println("La titulación actual es:" + docente.gettitulacion());
				System.out.println("Ingrese nueva Titulación:");				
				docente.settitulacion(sc.nextLine());
				break;
				
			case 3:
				System.out.println("La material actual es:" + docente.getmateriaImparte());
				System.out.println("Ingrese nueva Materia:");				
				docente.setmateriaImparte(sc.nextLine());
				break;
				
			case 4: 
				System.out.println("La dirección actual es:" + docente.getdirección());
				System.out.println("Ingrese nueva Dirección:");				
				docente.setdirección(sc.nextLine());
				break;
			
			case 5:
				System.out.println("El telefono actual es:" + docente.gettelefono());	
				System.out.println("Ingrese nuevo Teléfono:");				
				docente.settelefono(sc.nextLine());
				break;
			
		}
	}

}
