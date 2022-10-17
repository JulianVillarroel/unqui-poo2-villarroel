package ar.edu.unq.poo2.tp8ObserverConcurso;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParticipanteTest {

	private Partida servidor;
	private Participante jugador;

	@BeforeEach
	void testSetUp() {
		jugador = new Participante("Julian");
		servidor = mock(Partida.class);
	}

	@Test
	void testConstructor() {
		assertEquals("Julian", jugador.getNombre());
		;
	}

	@Test
	void testUnJugadorSolicitaUnirseAUnaPartida() {
		jugador.unirseAPartida(servidor);

		verify(servidor).agregarParticipante(jugador);
	}

	@Test
	void testUnJugadorEnviaUnaRespuestaPeroElJuegoNoComienza() {

		jugador.unirseAPartida(servidor);
		jugador.enviarRespuesta("b");

		verify(servidor, never()).verificarRespuesta(jugador, "a", "b");
	}

	@Test
	void testUnJugadorEnviaUnaRespuestaYElServidorLaVerificad() {
		jugador.unirseAPartida(servidor);
		jugador.recibirNotificacion("Partida Iniciada");
		List<String> preguntas = new ArrayList<String>();
		preguntas.add("a");
		preguntas.add("b");
		jugador.recibirPreguntas(preguntas);
		jugador.enviarRespuesta("c");

		verify(servidor, never()).verificarRespuesta(jugador, "a", "b");
	}

	@Test
	void testUnJugadorEnviaUnaRespuestaPeroElJuegoYaFinalizo() {

		jugador.unirseAPartida(servidor);
		jugador.recibirNotificacion("Partida Iniciada");
		jugador.recibirNotificacion("Julian gano la partida");
		jugador.enviarRespuesta("c");

		verify(servidor, never()).verificarRespuesta(jugador, "a", "b");
	}

	@Test
	void testUnJugadorEnviaDosRespuestasAlJuegoDeDiferentesPreguntas() {
		jugador.unirseAPartida(servidor);
		jugador.recibirNotificacion("Partida Iniciada");
		List<String> preguntas = new ArrayList<String>();
		preguntas.add("a");
		preguntas.add("b");
		jugador.recibirPreguntas(preguntas);
		jugador.enviarRespuesta("c");
		jugador.recibirNotificacionDeRespuesta("Correcta");
		jugador.enviarRespuesta("d");

		verify(servidor).verificarRespuesta(jugador, "a", "c");
		verify(servidor).verificarRespuesta(jugador, "b", "d");
	}

	@Test
	void testUnJugadorEnviaDosRespuestaAlJuegoDeLaMismaPregunta() {

		jugador.unirseAPartida(servidor);
		jugador.recibirNotificacion("Partida Iniciada");
		List<String> preguntas = new ArrayList<String>();
		preguntas.add("a");
		preguntas.add("b");
		jugador.recibirPreguntas(preguntas);
		jugador.enviarRespuesta("c");
		jugador.recibirNotificacionDeRespuesta("Incorrecta");
		jugador.enviarRespuesta("d");

		verify(servidor).verificarRespuesta(jugador, "a", "c");
		verify(servidor).verificarRespuesta(jugador, "a", "d");
	}
}
