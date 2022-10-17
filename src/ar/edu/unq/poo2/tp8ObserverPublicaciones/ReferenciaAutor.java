package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import java.util.List;

public class ReferenciaAutor extends ReferenciaLista{
	
		public ReferenciaAutor(String referencia) {
			super(referencia);
		}
		
		@Override
		protected List<String> getCampo(Articulo articulo) {
			return articulo.getAutores();
		}
}
