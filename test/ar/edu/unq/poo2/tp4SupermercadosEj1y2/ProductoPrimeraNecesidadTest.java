package ar.edu.unq.poo2.tp4SupermercadosEj1y2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4SupermercadoEj1y2.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;

	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.9);
		arroz = new ProductoPrimeraNecesidad("arroz", 18.9d, false, 0.5);
	}

	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());

		assertEquals(9.45d, arroz.getPrecio());
	}
}
