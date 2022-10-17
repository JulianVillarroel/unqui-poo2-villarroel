package ar.edu.unq.poo2.tp8ObserverConcurso;

public interface EstadoDePartida {

	public void iniciarPartida(Partida servidor);

	public void verificarRespuesta(Participante participante, String pregunta, String respuesta, Partida servidor);

}
