package GestionVehiculos;

public class CocheMercedes extends Coche{
	
private Double descuento;
	
	public CocheMercedes(Double velocidad, Double precio, String color, Double descuento) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.descuento = descuento;
	}
	
	public Double getdescuento() {
		return this.descuento;
	}
	
	public void setdescuento(Double nuevodescuento) {
		this.descuento = nuevodescuento;
	}
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Descuento: " +  this.descuento + "\n";
		return detalle;
	}

}
