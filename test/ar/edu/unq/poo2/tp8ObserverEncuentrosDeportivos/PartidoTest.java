package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PartidoTest {
	
	private Partido partido;

	@Test
	void test() {
		List<String> contrincantes = new ArrayList<String>();
		
		partido = new Partido("Ping Pong", contrincantes, "2 a 3");
		
		
		assertEquals("Ping Pong", partido.getDeporte());
		assertEquals(contrincantes, partido.getContrincantes());
		assertEquals("2 a 3", partido.getResultado());
	}

}
