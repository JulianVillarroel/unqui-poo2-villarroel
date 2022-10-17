package ar.edu.unq.poo2.tp8ObserverPublicaciones;

public class ReferenciaTitulo extends ReferenciaNombre {

	public ReferenciaTitulo(String titulo) {
		super(titulo);
	}

	protected String getCampo(Articulo articulo) {

		return articulo.getTitulo();
	}
}
