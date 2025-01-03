package GestionVehiculos;

public class CocheSeat extends Coche{
	
	private Double longitud;
	private String matricula;
	
	public CocheSeat(Double velocidad, Double precio, String color, Double longitud, String matricula) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.longitud = longitud;
		this.matricula = matricula;
	}
	
	public Double getlongitud() {
		return this.longitud;
	}
	
	public void setlongitud(Double nuevolongitud) {
		this.longitud = nuevolongitud;
	}
	public String getmatricula() {
		return "SE" + this.matricula;
	}
	public void setmatricula(String nuevomatricula) {
		this.matricula = nuevomatricula;
	}
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Longitud: " + this.getlongitud() + "\n";
		detalle = detalle + "Matricula: " + this.getmatricula() + "\n";
		return detalle;
	}

}
