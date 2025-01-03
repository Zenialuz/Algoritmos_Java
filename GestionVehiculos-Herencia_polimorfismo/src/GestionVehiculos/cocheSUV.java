package GestionVehiculos;

public class cocheSUV extends Coche{
	
	private Double peso;
	
	public cocheSUV(Double velocidad, Double precio, String color, Double peso) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.peso = peso;
	}
	
	public Double getpeso() {
		return this.peso;
	}
	
	public void setpeso(Double nuevopeso) {
		this.peso = nuevopeso;
	}
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Peso: " + this.peso + "\n";
		return detalle;
	}
	

}
