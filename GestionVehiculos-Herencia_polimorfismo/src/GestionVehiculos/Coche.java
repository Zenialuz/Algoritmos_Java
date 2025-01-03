package GestionVehiculos;

public class Coche {
	private Double velocidad;
	private Double precio;
	private String color;
	
	public Coche(Double velocidad, Double precio, String color) {
		
		// Inicializando los atributos asignados.
		this.velocidad = velocidad;
		this.precio = precio;
		this.color = color;
	}
	
	// Creando el método getvelocidad, para obtener la velocidad.
	public Double getvelocidad() {
		return this.velocidad;
	}
	// Creando el método setvelocidad, para establecer una nueva velocidad
	public void setvelocidad(Double nuevovelocidad) {
		this.velocidad = nuevovelocidad;
	}
	// Creando el método getprecio, para obtener el precio.
	public Double getprecio() {
		return this.precio;
	}
		// Creando el método setprecio, para establecer un nuevo precio
	public void setprecio(Double nuevoprecio) {
		this.precio = nuevoprecio;
	}
	// Creando el método getcolor, para obtener el color.
	public String getcolor() {
		return this.color;
	}
	// Creando el método setvelocidad, para establecer una nueva velocidad
	public void setcolor(String nuevocolor) {
		this.color = nuevocolor;
	}
	
	//Método para mostrar los detalles del Docente en un texto, separado por tabulaciones.
	public String toString() {
		String detalle;
		detalle ="Velocidad: " + this.velocidad + " - \n";
		detalle = detalle + "Precio: " + this.precio + "\n";
		detalle = detalle + "Color: " + this.color + "\n";
		return detalle;
	}
			
}
