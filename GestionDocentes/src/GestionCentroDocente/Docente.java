package GestionCentroDocente;

public class Docente {
	private String nombre;
	private String apellido_paterno;
	private String apellido_materno;
	private String dni;
	private String correoElectronico;
	private String titulacion;
	private String materiaImparte;
	private String dirección;
	private String telefono;
	
	//Creando el constructor Docente, con los parámetros nombre,apellido paterno, apellido matero y dni.
	
	public Docente(String nombre, String apellido_paterno, String apellido_materno, String dni) {
				
		// Inicializando los atributos asignados.
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.dni = dni;
		this.correoElectronico = "";
		this.titulacion = "";
		this.materiaImparte = "";
		this.dirección = "";
		this.telefono = "";
	}
	
	// //Creando el constructor Docente, con todos los parámetros.
	public Docente(String nombre, String apellido_paterno, String apellido_materno, String dni,
			String correoElectronico, String titulacion, String materiaImparte, String dirección, String telefono) {
		
		// Inicializando los atributos asignados.
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.dni = dni;
		this.correoElectronico = correoElectronico;
		this.titulacion = titulacion;
		this.materiaImparte = materiaImparte;
		this.dirección = dirección;
		this.telefono = telefono;
	}
	
	// Creando el método getnombre, para obtener el nombre.
		public String getnombre() {
			return this.nombre;
		}	
	
		// se comenta esto porque nos indican que una vez creado el docente no se puede modificar este dato.
	// 	//Creando el método setnombre, para establecer un nuevo nombre. 
		//public void setnombre(String nuevonombre) {
			//this.nombre = nuevonombre;
		//}
	// Creando el método getapellido_paterno, para obtener el nuevoapellido_paterno.
		public String getapellido_paterno() {
			return this.apellido_paterno;
		}	
						
	// se comenta esto porque nos indican que una vez creado el docente no se puede modificar este dato.
		//Creando el método setapellido_paterno, para establecer un nuevo apellido_paterno.
		//public void setapellido_paterno(String nuevoapellido_paterno) {
			//this.apellido_paterno = nuevoapellido_paterno;
		//}
		
	// Creando el método getapellido_materno, para obtener el nuevoapellido_materno.
		public String getapellido_materno() {
			return this.apellido_materno;
		}	
	
	// se comenta esto porque nos indican que una vez creado el docente no se puede modificar este dato.
	// Creando el método setapellido_materno, para establecer un nuevo apellido_materno.
		//public void setapellido_materno(String nuevoapellido_materno) {
			//this.apellido_materno = nuevoapellido_materno;
		//}
	// Creando el método getdni, para obtener el nuevo dni.
		public String getdni() {
			return this.dni;
		}	
	// se comenta esto porque nos indican que una vez creado el docente no se puede modificar este dato.									
	// Creando el método setdni, para establecer un nuevo dni.
		//public void setdni(String nuevodni) {
			//this.dni = nuevodni;
		//}
	// Creando el método getcorreoElectronico, para obtener el nuevo correoElectronico.
		public String getcorreoElectronico() {
			return this.correoElectronico;
		}	
												
	// Creando el método setcorreoElectronico, para establecer un nuevo correoElectronico.
		public void setcorreoElectronico(String nuevocorreoElectronico) {
			this.correoElectronico = nuevocorreoElectronico;
		}
	// Creando el método gettitulacion, para obtener el nuevo titulacion.
		public String gettitulacion() {
			return this.titulacion;
		}	
												
	// Creando el método settitulacion, para establecer un nuevo titulacion.
		public void settitulacion(String nuevotitulacion) {
			this.titulacion = nuevotitulacion;
		}
		
	// Creando el método getmateriaImparte, para obtener el nuevo materiaImparte.
		public String getmateriaImparte() {
			return this.materiaImparte;
		}	
														
	// Creando el método setmateriaImparte, para establecer un nuevo materiaImparte.
		public void setmateriaImparte(String nuevomateriaImparte) {
			this.materiaImparte = nuevomateriaImparte;
		}
		
	// Creando el método getdirección, para obtener el nuevo dirección.
		public String getdirección() {
			return this.dirección;
		}	
												
	// Creando el método setdirección, para establecer un nuevo dirección.
		public void setdirección(String nuevodirección) {
			this.dirección = nuevodirección;
		}
	// Creando el método gettelefono, para obtener el nuevo telefono.
		public String gettelefono() {
			return this.telefono;
		}	
												
	// Creando el método settelefono, para establecer un nuevo telefono.
		public void settelefono(String nuevotelefono) {
			this.telefono = nuevotelefono;
		}
		
	//Método para mostrar los detalles del Docente en un texto, separado por tabulaciones.
		public String toString() {
			String detalle;
			
			detalle = this.nombre + " - \t";
			detalle = detalle + this.apellido_paterno + "\t";
			detalle = detalle + this.apellido_materno + "\t";
			detalle = detalle + this.dni + "\t";
			detalle = detalle + this.correoElectronico + "\t";
			detalle = detalle + this.titulacion + "\t";
			detalle = detalle + this.materiaImparte + "\t";
			detalle = detalle + this.dirección + "\t";
			detalle = detalle + this.telefono + "\t";							
			return detalle;
			
		}
}
