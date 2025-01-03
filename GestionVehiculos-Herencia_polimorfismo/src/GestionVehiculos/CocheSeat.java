package GestionVehiculos;

public class CocheSeat extends Coche{
	
private Double longitud;
	
	public CocheSeat(Double velocidad, Double precio, String color, Double longitud) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.longitud = longitud;
	}
	
	public Double getlongitud() {
		return this.longitud;
	}
	
	public void setlongitud(Double nuevolongitud) {
		this.longitud = nuevolongitud;
	}
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Longitud: " + this.longitud + "\n";
		return detalle;
	}

}
