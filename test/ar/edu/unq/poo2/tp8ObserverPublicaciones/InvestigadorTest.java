package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InvestigadorTest {

	private Investigador investigador;
	private Articulo articulo;
	private SistemaDePublicaciones sistemaDePublicaciones;

	@BeforeEach
	public void testSetUp() {
		investigador = new Investigador();
		articulo = mock(Articulo.class);
		sistemaDePublicaciones = mock(SistemaDePublicaciones.class);
	}

	@Test
	void testUnInvestigadorCargaUnArticuloEnSistemaDePublicaciones() {

		investigador.cargarArticulo(articulo, sistemaDePublicaciones);

		verify(sistemaDePublicaciones).agregarArticulo(articulo);
	}

	@Test
	void testUnInvestigadorSeSuscribeAUnSistemaDePublicacionesConUnaReferencia() {

		IReferencia referencia = mock(IReferencia.class);

		investigador.suscribirse(referencia, sistemaDePublicaciones);
		
		verify(sistemaDePublicaciones).agregarSuscriptor(investigador);
		
		assertEquals(1, investigador.getReferencias().size());
	}
	
	@Test
	void testUnInvestigadorRecibeUnArticuloYAhoraTiene1Articulo() {
		
		Articulo articulo = mock(Articulo.class);
		
		investigador.recibirArticulo(articulo);
		
		assertEquals(1, investigador.getArticulos().size());
	}
	
	
	
	
	
	
	
	
}
