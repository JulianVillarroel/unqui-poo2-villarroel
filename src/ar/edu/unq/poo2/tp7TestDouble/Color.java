package ar.edu.unq.poo2.tp7TestDouble;

import java.util.List;

public class Color extends Jugada {

	@Override
	protected String tipoDeJugada() {
		return "Color";
	}

	@Override
	protected Jugada siguienteJugada() {
		return new Trio();
	}

	@Override
	protected Boolean esJugada(List<Carta> listaDeCartas) {
		return cantidadDePalosSinRepetidos(listaDeCartas) == 1;
	}

	@Override
	protected Boolean leGanaATipoDeJugada(Jugada tipoDeJugada) {
		return (tipoDeJugada.getClass() == Poquer.class);
	}

	@Override
	protected Integer getValorDeJugada() {
		List<Carta> listaDeCartas = this.getListaDeCartas();
		
		return listaDeCartas.stream().mapToInt(Carta::getValorNumerico).sum();
	}

}
