package GestionVehiculos;

public class CocheMercedes extends Coche implements IMatriculaCoche{
	
	private Double descuento;
	private String matricula;
	
	public CocheMercedes(Double velocidad, Double precio, String color, Double descuento, String matricula) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.descuento = descuento;
		this.matricula = matricula;
	}
	
	public Double getdescuento() {
		return this.descuento;
	}
	
	public void setdescuento(Double nuevodescuento) {
		this.descuento = nuevodescuento;
	}
	public String getmatricula() {
		return "ME" + this.matricula;
	}
	public void setmatricula(String nuevomatricula) {
		this.matricula = nuevomatricula;
	}
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Descuento: " +  this.getdescuento() + "\n";
		detalle = detalle + "Matricula: " + this.getmatricula() + "\n";
		return detalle;
	}

}
