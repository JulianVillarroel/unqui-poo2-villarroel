package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SistemaDePublicaciones {

	private List<Articulo> articulos;
	private Set<Suscriptor> suscriptores;

	public SistemaDePublicaciones() {
		this.articulos = new ArrayList<Articulo>();
		this.suscriptores = new HashSet<Suscriptor>();
	}

	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
		this.notificarPublicaciones(articulo);
	}

	public void agregarSuscriptor(Suscriptor suscriptor) {
		suscriptores.add(suscriptor);
	}
	
	
	public void notificarPublicaciones(Articulo articulo) {
		for(Suscriptor suscriptor : this.suscriptores) {
			this.notificar(suscriptor, articulo);
		}
	}
	
	public void notificar(Suscriptor suscriptor, Articulo articulo) {
		if (this.chequearSuscripciones(suscriptor, articulo)) {
			suscriptor.recibirArticulo(articulo);
		}
	}
	
	public Boolean chequearSuscripciones(Suscriptor suscriptor, Articulo articulo) {
		Boolean resultado = false;
		for(IReferencia referencia: suscriptor.getReferencias()) {
			resultado |= referencia.chequear(articulo);
		}
		return resultado;
	}
}
