package ar.edu.unq.poo2.tp8ObserverPublicaciones;

public abstract class ReferenciaNombre implements IReferencia {

	private String referencia;

	public ReferenciaNombre(String referencia) {
		this.referencia = referencia;
	}

	public Boolean chequear(Articulo articulo) {

		return this.chequearCampo(this.getCampo(articulo));
	}

	protected Boolean chequearCampo(String campo) {
		return campo.equals(referencia);
	}

	protected abstract String getCampo(Articulo articulo);
}
