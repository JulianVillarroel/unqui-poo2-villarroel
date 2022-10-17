package ar.edu.unq.poo2.tp8ObserverPublicaciones;

public class ReferenciaEditorial extends ReferenciaNombre {

	public ReferenciaEditorial(String referencia) {
		super(referencia);
	}

	@Override
	protected String getCampo(Articulo articulo) {

		return articulo.getEditorial();
	}
}
