package ar.edu.unq.poo2.tp6BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BancoTest {
	
	private Banco banco;
	private Cliente cliente;
	private PropiedadInmobiliaria garantia;
	
	@Before
	public void setUp() {
		banco = new Banco();
		garantia = new PropiedadInmobiliaria("departamento", "Otamendi", 4000);
		cliente = new Cliente("Julian", "Villarroel", "Otamendi", 23, 10000d, garantia);
	}
	
	@Test
	public void testBancoNoTieneRegistradoClientesYSuCantidadDeClientesEsDeCero() {
		assertEquals(0, banco.getClientes().size());
	}
	
	@Test
	public void testBancoRegisrtaUnClienteYSuCantidadDeClientesEsUno() {
		banco.registrarCliente(cliente);
		
		assertEquals(1, banco.getClientes().size());
	}
	
	@Test
	public void testOtorgarPrestamos() {
		SolicitudDeCredito solicitudPersonal = new SolicitudDeCreditoPersonal(cliente, 2000d, 10);
		SolicitudDeCredito solicitudHipotecario = new SolicitudDeCreditoHipotecario(cliente, 4000d, 5);
		
		assertEquals(2000d, banco.otorgarPrestamo(solicitudPersonal));
		assertEquals(0d, banco.otorgarPrestamo(solicitudHipotecario));
	}
}
