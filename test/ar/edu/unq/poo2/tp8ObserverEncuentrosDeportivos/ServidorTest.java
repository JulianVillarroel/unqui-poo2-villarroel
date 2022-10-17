package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorTest {
	
	private Servidor servidor;
	private Aplicacion notificador;
	private Deporte deporte;
	
	
	@BeforeEach
	public void setUp() {
		servidor = new Servidor();
		notificador = mock(Aplicacion.class);
		deporte = mock(Deporte.class);
	}
		
	@Test
	void testSeSuscribeAlDeporteTenis() {
		
		servidor.suscribirse(notificador, deporte);
		
		verify(notificador).suscribir(servidor,deporte);
	}
	
	
	@Test
	void testRecibeElResultadoDeDorPartidosYLaCantidadDeResultadosEsDos() {
		Partido partido1 = mock(Partido.class);
		Partido partido2 = mock(Partido.class);
		
		servidor.recibirInformacion(partido1);
		servidor.recibirInformacion(partido2);
		
		assertEquals(2, servidor.getPartidos().size());
	}

}
