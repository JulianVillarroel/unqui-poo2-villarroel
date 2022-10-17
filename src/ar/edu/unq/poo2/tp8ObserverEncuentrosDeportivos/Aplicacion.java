package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Aplicacion {

	private Map<Suscriptor, Set<Interes>> suscripciones;
	private Set<Partido> partidos;

	public Aplicacion() {
		this.suscripciones = new HashMap<Suscriptor, Set<Interes>>();
		partidos = new HashSet<Partido>();
	}

	public Set<Interes> getSuscripcion(Suscriptor suscriptor) {
		return suscripciones.get(suscriptor);
	}

	public Set<Suscriptor> getSuscriptores() {
		return suscripciones.keySet();
	}

	public void agregarPartido(Partido partido) {
		partidos.add(partido);
		this.notificar(partido);
	}

	public void suscribir(Suscriptor suscriptor, Interes interes) {
		if (suscripciones.containsKey(suscriptor)) {
			this.getSuscripcion(suscriptor).add(interes);
		} else {
			Set<Interes> listaDeSuscripcion = new HashSet<Interes>();
			listaDeSuscripcion.add(interes);
			suscripciones.put(suscriptor, listaDeSuscripcion);
		}
	}

	private void notificar(Partido partido) {
		for (Suscriptor suscriptor : this.getSuscriptores()) {
			this.chequearSuscripcionYNotificar(suscriptor, partido);
		}
	}

	private void chequearSuscripcionYNotificar(Suscriptor suscriptor, Partido partido) {
		if (this.chequearSuscripcion(suscriptor, partido)) {
			suscriptor.recibirInformacion(partido);
		}
	}

	private boolean chequearSuscripcion(Suscriptor suscriptor, Partido partido) {
		Boolean resultado = false;
		for (Interes interes : this.getSuscripcion(suscriptor)) {
			resultado |= interes.chequearPartido(partido);
		}
		return resultado;
	}

}
