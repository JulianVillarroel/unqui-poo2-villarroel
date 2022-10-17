package ar.edu.unq.poo2.tp8ObserverPublicaciones;

public class ReferenciaTipo extends ReferenciaNombre{
	
	public ReferenciaTipo(String referencia) {
		super(referencia);
	}
	
	@Override
	protected String getCampo(Articulo articulo) {
		return articulo.getTipo();
	}
}
