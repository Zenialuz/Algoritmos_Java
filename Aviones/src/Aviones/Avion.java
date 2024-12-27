package Aviones;

public class Avion {
	private String codigoAvion;
	private int asientosDisponibles;
	private double km_autonomia;
	private String ultimaRevision;
	private String nom_apell_resp;
	
	// Creando el constructor Avion, con los parámetros codigoAvion,asientosDisponibles, km_autonomia, ultimaRevision,Nom_apell_resp.
			public Avion(String codigoAvion, int asientosDisponibles, double km_autonomia, String ultimaRevision, String nom_apell_resp) {
				
				
				// Inicializando los atributos asignados.
				this.codigoAvion = codigoAvion;
				this.asientosDisponibles = asientosDisponibles;
				this.km_autonomia = km_autonomia;
				this.ultimaRevision = ultimaRevision;
				this.nom_apell_resp = nom_apell_resp;
				
			}
			
			// Creando el método codigoAvion, para obtener el Código del avión.
			public String getcodigoAvion() {
				return this.codigoAvion;
			}	
			
			// Creando el método codigoAvion, para establecer un nuevo código para el avión.
			public void setcodigoAvion(String nuevocodigoAvion) {
				this.codigoAvion = nuevocodigoAvion;
			}
			// Creando el método asientosDisponibles, para obtener el total de asientos disponibles.
			public int getasientosDisponibles() {
				return this.asientosDisponibles;
			}	
						
			// Creando el método asientosDisponibles, para establecer nuevo asientosDisponibles.
			public void setasientosDisponibles(int nuevoasientosDisponibles) {
				this.asientosDisponibles = nuevoasientosDisponibles;
			}
			// Creando el método km_autonomia, para obtener los km_autonomia del avión.
			public Double getkm_autonomia() {
				return this.km_autonomia;
			}	
						
			// Creando el método km_autonomia, para establecer un nuevo km_autonomia para el avión.
			public void setkm_autonomia(Double nuevokm_autonomia) {
				this.km_autonomia = nuevokm_autonomia;
			}
			// Creando el método ultimaRevision, para obtener la ultimaRevision del avión.
			public String getultimaRevision() {
				return this.ultimaRevision;
			}	
						
			// Creando el método ultimaRevision, para establecer una nueva ultimaRevision para el avión.
			public void setultimaRevision(String nuevoultimaRevision) {
				this.ultimaRevision = nuevoultimaRevision;
			}
			// Creando el método nom_apell_resp, para obtener el Nombre del responsable del avión.
			public String getnom_apell_resp() {
				return this.nom_apell_resp;
			}							
			// Creando el método codigoAvion, para establecer un nuevo código para el avión.
			public void setnom_apell_resp(String nuevonom_apell_resp) {
				this.nom_apell_resp = nuevonom_apell_resp;
			}
			//Método para mostrar los detalles del alumno en un texto, separado por tabulaciones.
			public String toString() {
				String detalle;
				
				detalle = this.codigoAvion + " - \t";
				detalle = detalle + this.asientosDisponibles + "\t";
				detalle = detalle + this.km_autonomia + "\t";
				detalle = detalle + this.ultimaRevision + "\t";
				detalle = detalle + this.nom_apell_resp;
								
				return detalle;
				
			}
	}
