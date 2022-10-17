package ar.edu.unq.poo2.tp8ObserverConcurso;

public interface EstadoDeParticipante {
	
	void recibirNotificacion(String notificacion, Participante participante);

	void enviarRespuesta(String respuesta, Partida servidor, Participante participante);
}
