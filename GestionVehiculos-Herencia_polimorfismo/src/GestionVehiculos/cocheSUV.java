package GestionVehiculos;

public class cocheSUV extends Coche implements IMatriculaCoche{
	
	private Double peso;
	private String matricula;
	
	public cocheSUV(Double velocidad, Double precio, String color, Double peso, String matricula) {
		// Inicializando los atributos asignados.
		
		super(velocidad, precio, color);
		this.peso = peso;
		this.matricula = matricula;
	}
	
	public Double getpeso() {
		return this.peso;
	}
	
	public void setpeso(Double nuevopeso) {
		this.peso = nuevopeso;
	}
	public String getmatricula() {
		return "SU" + this.matricula;
	}
	public void setmatricula(String nuevomatricula) {
		this.matricula = nuevomatricula;
	}
	
	
	public String toString() {
		String detalle;
		
		detalle = super.toString();
		detalle = detalle + "Peso: " + this.getpeso() + "\n";
		detalle = detalle + "Matricula: " + this.getmatricula() + "\n";
		return detalle;
	}
	

}
