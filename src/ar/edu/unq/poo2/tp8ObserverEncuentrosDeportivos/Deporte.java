package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

public class Deporte implements Interes {
	private String tipo;

	public Deporte(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public Boolean chequearPartido(Partido partido) {
		return partido.getDeporte().equals(tipo);
	}

}
