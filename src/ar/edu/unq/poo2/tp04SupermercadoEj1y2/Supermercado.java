package ar.edu.unq.poo2.tp04SupermercadoEj1y2;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;

	public Supermercado(String nombre, String direccion, List<Producto> productos) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	public Integer getCantidadDeProductos() {
		return productos.size();
	}

	public Double getPrecioTotal() {
		Double sumaDeProductos = 0d;
		for (Producto producto : productos) {
			sumaDeProductos += producto.getPrecio();
		}
		return sumaDeProductos;
	}
}
