package ar.edu.unq.poo2.tp8ObserverConcurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Partida {

	private HashMap<Participante, Integer> participantes;
	private HashMap<String, String> preguntasYRespuestas;
	private EstadoDePartida estado;

	public Partida() {
		this.participantes = new HashMap<Participante, Integer>();
		this.preguntasYRespuestas = new HashMap<String, String>();
		this.estado = new EstadoEnEspera();
	}

	public void agregarPregunta(String pregunta, String respuesta) {
		if (preguntasYRespuestas.size() < 5) {
			this.preguntasYRespuestas.put(pregunta, respuesta);
		}
	}

	public void agregarParticipante(Participante participante) {
		if (participantes.size() < 5) {
			this.participantes.put(participante, 0);
		}
	}

	public void iniciarPartida() {
		this.estado.iniciarPartida(this);

	}

	public void verificarRespuesta(Participante participante, String pregunta, String respuesta) {
		estado.verificarRespuesta(participante, pregunta, respuesta, this);

	}

	public Integer puntajeDeParticipante(Participante participante) {
		return participantes.get(participante);
	}

	public List<String> getPreguntas() {
		return new ArrayList<String>(preguntasYRespuestas.keySet());
	}

	public ArrayList<Participante> getParticipantes() {
		return new ArrayList<Participante>(participantes.keySet());
	}

	protected void setEstado(EstadoDePartida estado) {
		this.estado = estado;
	}

	protected boolean esRespuestaCorrecta(String pregunta, String respuesta) {
		String respuestaCorrecta = preguntasYRespuestas.get(pregunta);
		return respuestaCorrecta.equals(respuesta);
	}

	protected void notificarATodos(String mensaje) {
		for (Participante participante : participantes.keySet()) {
			this.notificar(participante, mensaje);
		}
	} 

	private void notificar(Participante participante, String notificacion) {
		participante.recibirNotificacion(notificacion);
	}
	
	protected void contabilizarPuntaje(Participante participante) {
		participantes.put(participante, this.puntajeDeParticipante(participante) + 1);
	}

}
