package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticuloTest {

	private Articulo articulo;

	@BeforeEach
	public void testSetUp() {

	}

	@Test
	void testConstructor() {
		List<String> listaDeAutores = new ArrayList<String>();
		List<String> listaDeAfiliaciones = new ArrayList<String>();
		List<String> palabrasClaves = new ArrayList<String>();

		articulo = new Articulo(listaDeAutores, "smalltalk", listaDeAfiliaciones, "MarchEditorial", "original",
				palabrasClaves);

		assertEquals(listaDeAfiliaciones, articulo.getAfiliaciones());
		assertEquals("smalltalk", articulo.getTitulo());
		assertEquals(listaDeAutores, articulo.getAutores());
		assertEquals("original", articulo.getTipo());
		assertEquals("MarchEditorial", articulo.getEditorial());
		assertEquals(palabrasClaves, articulo.getPalabrasClaves());
	}

}
