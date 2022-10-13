package ar.edu.unq.poo2.tp5CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	private List<Pagable> listaDeProducto;
	
	public Cliente() {
		listaDeProducto = new ArrayList<Pagable>();
	}
	
	public List<Pagable> getListaDePagables() {
		return listaDeProducto;
	}

	public void agregarAListaDeCosasAPagar(Pagable pagable) {
		listaDeProducto.add(pagable);
	}
}
