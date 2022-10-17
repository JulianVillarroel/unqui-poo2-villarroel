package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil implements Suscriptor{
	
	private List<Partido> partidos; 
	
	public AplicacionMovil() {
		this.partidos = new ArrayList<Partido>();
	}

	@Override
	public void recibirInformacion(Partido partido) {
		partidos.add(partido);
	}
	
	public void suscribirse(Aplicacion notificador, Interes interes) {
		notificador.suscribir(this, interes);
	}
}
