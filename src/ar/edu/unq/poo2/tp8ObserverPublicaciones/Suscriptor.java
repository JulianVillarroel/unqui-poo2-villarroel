package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import java.util.List;

public interface Suscriptor {

	public void recibirArticulo(Articulo articulo);

	List<IReferencia> getReferencias();
}
