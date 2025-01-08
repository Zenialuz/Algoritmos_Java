package CarritoCompras;

public class Producto {
	private int idProducto;
	private String nombreProducto;
	private double precioProducto;
	
	public Producto(int idProducto, String nombreProducto, double precioProducto) {
		
		// Inicializando los atributos asignados.
		this.idProducto =idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;

	}
	
	public int getidProducto() {
		return this.idProducto;
	}
	
	// Creando el método setcodigoProducto, para establecer un nuevo id del producto.
	public void setidProducto(int nuevoidProducto) {
		this.idProducto = nuevoidProducto;
	}
	public String getnombreProducto() {
		return this.nombreProducto;
	}
	
	// Creando el método setcodigoProducto, para establecer un nuevo id del producto.
	public void setnombreProducto(String nuevonombreProducto) {
		this.nombreProducto = nuevonombreProducto;
	}
	public Double getprecioProducto() {
		return this.precioProducto;
	}
	
	// Creando el método setcodigoProducto, para establecer un nuevo id del producto.
	public void setnombreProducto(Double nuevoprecioProducto) {
		this.precioProducto = nuevoprecioProducto;
	}
	
	public String toString() {
		String detalle;
		
		detalle = this.idProducto + "\t";
		detalle = detalle + this.nombreProducto + "\t";
		detalle = detalle + this.precioProducto + "\t";
		return detalle;
		
	}

}
	
	
	
	
