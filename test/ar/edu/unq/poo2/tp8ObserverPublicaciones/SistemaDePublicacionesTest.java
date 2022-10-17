package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class SistemaDePublicacionesTest {
	
	private SistemaDePublicaciones sistemaDePublicaciones;
	
	@Test
	void testSeAgregaUnArticuloYSeNotificaALosSuscriptores() {
		
		Articulo articulo = mock(Articulo.class);
		IReferencia referencia1 = mock(IReferencia.class);
		IReferencia referencia2 = mock(IReferencia.class);
		Investigador investigador1 = mock(Investigador.class);
		Investigador investigador2 = mock(Investigador.class);
		List<IReferencia> referencias1 = new ArrayList<IReferencia>();
		List<IReferencia> referencias2 = new ArrayList<IReferencia>();
		
		sistemaDePublicaciones = new SistemaDePublicaciones();
		sistemaDePublicaciones.agregarSuscriptor(investigador1);
		sistemaDePublicaciones.agregarSuscriptor(investigador2);
		referencias1.add(referencia1);
		referencias2.add(referencia2);
		
		
		when(investigador1.getReferencias()).thenReturn(referencias1);
		when(investigador2.getReferencias()).thenReturn(referencias2);
		when(referencia1.chequear(articulo)).thenReturn(true);
		when(referencia2.chequear(articulo)).thenReturn(false);
		
		sistemaDePublicaciones.agregarArticulo(articulo);
		
		verify(investigador1).recibirArticulo(articulo);
		verify(investigador2,never()).recibirArticulo(articulo);
	}

}
