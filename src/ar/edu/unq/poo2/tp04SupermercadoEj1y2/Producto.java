package ar.edu.unq.poo2.tp04SupermercadoEj1y2;

public class Producto {

	private String nombreDelProducto;
	private Double precio;
	private Boolean esPrecioCuidado;

	public Producto(String nombreDelProducto, Double precio, Boolean esPrecioCuidado) {
		this.nombreDelProducto = nombreDelProducto;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, Double precio) {
		this.nombreDelProducto = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}

	public String getNombre() {
		return this.nombreDelProducto;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public void aumentarPrecio(Double precio) {
		this.precio += precio;
	}

}
