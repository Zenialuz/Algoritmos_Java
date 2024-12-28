package GestionCentroDocente;

public class programaPrincipal {

	public static void main(String[] args) {
			
		//Creando los 3 docentes, usando el constructor de la clase Docente.
		Docente docente1 = new Docente("Ana", "Meza", "Ore", "12345678H");
		Docente docente2 = new Docente("Rosa", "Avila", "Vargas", "12343478P");
		Docente docente3 = new Docente("Mia", "Loza", "Castro", "22345678J");
		
		//Agregando datos de correo, dirección y teléfono al primer docente.
		docente1.setcorreoElectronico("anam@gmail.com");
		docente1.setdirección("jr. Olaya 226");
		docente1.settelefono("656489345");
		
		docente3.settitulacion("Ingeniero");
		docente3.setdirección("jr. Olaya 226");
		docente3.settelefono("656489345");
		
		//Imprimiendo por consola la cabecera de los datos de los aviones.
		System.out.println( "Nombre \tAp Pat\tAp Mat \t DNI\t Correo \t Titulo \t Materia \tDirección\t Teléfono");
		
		//Imprimiendo por consola los datos de los aviones creados.
		System.out.println(docente1.toString());
		System.out.println(docente2.toString());
		System.out.println(docente3.toString());
	}

}
