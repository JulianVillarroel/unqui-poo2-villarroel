package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ReferenciaTest {
	private IReferencia referencia;
	private ConjuntoDeReferencias referenciaCompuesta;

	@Test
	void testVerificarTituloDaTrue() {
		referencia = new ReferenciaTitulo("Smalltalk");
		Articulo articulo = mock(Articulo.class);

		when(articulo.getTitulo()).thenReturn("Smalltalk");

		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarTituloDaFalse() {
		referencia = new ReferenciaTitulo("Java");
		Articulo articulo = mock(Articulo.class);
		
		when(articulo.getTitulo()).thenReturn("Smalltalk");
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarAutorDaTrue() {
		referencia = new ReferenciaAutor("Gamma");
		Articulo articulo = mock(Articulo.class);
		List<String> listaDeAutores = new ArrayList<String>();
		listaDeAutores.add("Gamma");
		
		when(articulo.getAutores()).thenReturn(listaDeAutores);
		
		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarAutorDaFalse() {
		referencia = new ReferenciaAutor("Helm");
		Articulo articulo = mock(Articulo.class);
		List<String> listaDeAutores = new ArrayList<String>();
		listaDeAutores.add("Gamma");
		
		when(articulo.getAutores()).thenReturn(listaDeAutores);
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarAfiliacionesDaTrue() {
		referencia = new ReferenciaAfiliaciones("Universidad");
		Articulo articulo = mock(Articulo.class);
		List<String> listaDeFiliaciones = new ArrayList<String>();
		listaDeFiliaciones.add("Universidad");
		
		when(articulo.getAfiliaciones()).thenReturn(listaDeFiliaciones);
		
		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarAfiliacionesDaFalse() {
		referencia = new ReferenciaAfiliaciones("Laboratorio");
		Articulo articulo = mock(Articulo.class);
		List<String> listaDeAfiliaciones = new ArrayList<String>();
		listaDeAfiliaciones.add("Universidad");
		
		when(articulo.getAutores()).thenReturn(listaDeAfiliaciones);
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarPalabraClaveDaTrue() {
		referencia = new ReferenciaPalabraClave("Programacion");
		Articulo articulo = mock(Articulo.class);
		List<String> palabrasClaves = new ArrayList<String>();
		palabrasClaves.add("Programacion");
		
		when(articulo.getPalabrasClaves()).thenReturn(palabrasClaves);
		
		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarPalabraClaveDaFalse() {
		referencia = new ReferenciaPalabraClave("Objetos");
		Articulo articulo = mock(Articulo.class);
		List<String> palabrasClaves = new ArrayList<String>();
		palabrasClaves.add("Programacion");
		
		when(articulo.getPalabrasClaves()).thenReturn(palabrasClaves);
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarEditorialDaTrue() {
		referencia = new ReferenciaEditorial("Bo");
		Articulo articulo = mock(Articulo.class);
		
		when(articulo.getEditorial()).thenReturn("Bo");
		
		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarEditorialDaFalse() {
		referencia = new ReferenciaEditorial("JM");
		Articulo articulo = mock(Articulo.class);
		
		when(articulo.getEditorial()).thenReturn("Bo");
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarTipoDaTrue() {
		referencia = new ReferenciaTipo("general");
		Articulo articulo = mock(Articulo.class);
		
		when(articulo.getTipo()).thenReturn("general");
		
		assertTrue(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarTipoDaFalse() {
		referencia = new ReferenciaTipo("informatico");
		Articulo articulo = mock(Articulo.class);
		
		when(articulo.getTipo()).thenReturn("general");
		
		assertFalse(referencia.chequear(articulo));
	}
	
	@Test
	void testVerificarReferenciaCompuestaDaTrue() {
		referenciaCompuesta = new ConjuntoDeReferencias();
		referencia = new ReferenciaEditorial("Bo");
		IReferencia referencia2 = new ReferenciaTipo("general");
		Articulo articulo = mock(Articulo.class);
		
		referenciaCompuesta.agregarReferencia(referencia);
		referenciaCompuesta.agregarReferencia(referencia2);
		
		
		when(articulo.getEditorial()).thenReturn("Bo");
		when(articulo.getTipo()).thenReturn("general");
		
		
		assertTrue(referenciaCompuesta.chequear(articulo));
	}
	
	@Test
	void testVerificarReferenciaCompuestaDaFalse() {
		referenciaCompuesta = new ConjuntoDeReferencias();
		referencia = new ReferenciaEditorial("JM");
		IReferencia referencia2 = new ReferenciaTipo("general");
		Articulo articulo = mock(Articulo.class);
		
		referenciaCompuesta.agregarReferencia(referencia);
		referenciaCompuesta.agregarReferencia(referencia2);
		
		when(articulo.getTipo()).thenReturn("general");
		when(articulo.getEditorial()).thenReturn("Bo");
		
		assertFalse(referenciaCompuesta.chequear(articulo));
	}

}
