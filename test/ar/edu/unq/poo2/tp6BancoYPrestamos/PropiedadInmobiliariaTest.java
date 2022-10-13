package ar.edu.unq.poo2.tp6BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PropiedadInmobiliariaTest {

	@Test
	public void testConstructor() {
		PropiedadInmobiliaria propiedad1 = new PropiedadInmobiliaria("departamento", "Otamendi", 4000);
		PropiedadInmobiliaria propiedad2 = new PropiedadInmobiliaria("terreno", "Ceballos", 6000);
		
		
		assertEquals("departamento", propiedad1.getDescripcion());
		assertEquals("Otamendi", propiedad1.getDireccion());
		assertEquals("4000", propiedad1.getValorFiscal());
		
		assertEquals("terreno", propiedad2.getDescripcion());
		assertEquals("Ceballos", propiedad2.getDireccion());
		assertEquals("6000", propiedad2.getValorFiscal());
		
	}
}
