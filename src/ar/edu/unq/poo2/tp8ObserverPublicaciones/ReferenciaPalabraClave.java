package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import java.util.List;

public class ReferenciaPalabraClave extends ReferenciaLista {

	public ReferenciaPalabraClave(String referencia) {
		super(referencia);
	}

	@Override
	protected List<String> getCampo(Articulo articulo) {
		return articulo.getPalabrasClaves();
	}
}
