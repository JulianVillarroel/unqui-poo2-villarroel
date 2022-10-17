package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotificadorTest {

	private Aplicacion notificador;
	private Deporte deporte;
	private Contrincante contrincante;

	@BeforeEach
	void testSetUp() {
		notificador = new Aplicacion();
		deporte = mock(Deporte.class);
		contrincante = mock(Contrincante.class);
	}

	@Test
	void testSeAgregaUnSuscriptorYLaCantidadDeSuscriptoresEsUno() {
		Suscriptor suscriptor = mock(Suscriptor.class);
		
		notificador.suscribir(suscriptor, deporte);
		
		assertEquals(1, notificador.getSuscriptores().size());
	}

	@Test
	void testSeAgreganDosSuscricionesDelMismoSuscriptorYLaCantidadDeSuscriptoresEsUno() {
		Suscriptor suscriptor = mock(Suscriptor.class);
		
		notificador.suscribir(suscriptor, deporte);
		notificador.suscribir(suscriptor, contrincante);
		
		assertEquals(1,notificador.getSuscriptores().size());
		assertEquals(2,notificador.getSuscripcion(suscriptor).size());
	}
	
	@Test
	void testSeNotificaAlServidorSuscriptoAlTenisYALaAplicacionMovil() {
		Suscriptor servidor = mock(Suscriptor.class);
		Suscriptor aplicacionMovil = mock(Suscriptor.class);
		Partido partido = mock(Partido.class);
		when(deporte.chequearPartido(partido)).thenReturn(true);
		
		notificador.suscribir(servidor, deporte);
		notificador.suscribir(aplicacionMovil, deporte);
		notificador.agregarPartido(partido);
		
		verify(servidor).recibirInformacion(partido);
		verify(aplicacionMovil).recibirInformacion(partido);
	}
	
	@Test
	void testSeNotificaAlServidorSuscriptoAlTenisYNoALaAplicacionMovilSuscriptaAlFutbol() {
		Suscriptor servidor = mock(Suscriptor.class);
		Suscriptor aplicacionMovil = mock(Suscriptor.class);
		Deporte deporte2 = mock(Deporte.class);
		Partido partido = mock(Partido.class);
		
		when(deporte.chequearPartido(partido)).thenReturn(true);
		when(deporte2.chequearPartido(partido)).thenReturn(false);
		
		notificador.suscribir(servidor, deporte);
		notificador.suscribir(aplicacionMovil, deporte2);
		notificador.agregarPartido(partido);
		
		verify(servidor).recibirInformacion(partido);
		verify(aplicacionMovil, never()).recibirInformacion(partido);
	}
	
	@Test
	void testSeNotificaAlServidorSuscriptoAlTenisYALaAplicacionMovilSuscriptaAlContricanteNadal() {
		Suscriptor servidor = mock(Suscriptor.class);
		Suscriptor aplicacionMovil = mock(Suscriptor.class);
		Partido partido = mock(Partido.class);
		
		when(deporte.chequearPartido(partido)).thenReturn(true);
		when(contrincante.chequearPartido(partido)).thenReturn(true);
		
		notificador.suscribir(servidor, deporte);
		notificador.suscribir(aplicacionMovil, contrincante);
		notificador.agregarPartido(partido);
		
		verify(servidor).recibirInformacion(partido);
		verify(aplicacionMovil).recibirInformacion(partido);
	}
	
	@Test
	void testSeNotificaAlServidorSuscriptoAlTenisYNoALaAplicacionMovilSuscriptaAlContricanteNadal() {
		Suscriptor servidor = mock(Suscriptor.class);
		Suscriptor aplicacionMovil = mock(Suscriptor.class);
		Partido partido = mock(Partido.class);
		
		when(deporte.chequearPartido(partido)).thenReturn(true);
		when(contrincante.chequearPartido(partido)).thenReturn(false);
		
		
		notificador.suscribir(servidor, deporte);
		notificador.suscribir(aplicacionMovil, contrincante);
		notificador.agregarPartido(partido);
		
		verify(servidor).recibirInformacion(partido);
		verify(aplicacionMovil, never()).recibirInformacion(partido);
	}
}
