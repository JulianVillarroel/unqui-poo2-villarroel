package ar.edu.unq.poo2.tp6BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente cliente;
	private Banco banco;
	private SolicitudDeCredito solicitudPersonal;
	private SolicitudDeCredito solicitudHipotecario;
	private PropiedadInmobiliaria garantia;

	@Before
	public void setUp() {
		garantia = new PropiedadInmobiliaria("departamento", "Otamendi", 4000);

		this.cliente = new Cliente("Julian", "Villarroel", "Otamendi", 23, 10000d, garantia);
		this.banco = new Banco();
		this.solicitudPersonal = new SolicitudDeCreditoPersonal(cliente, 2000d, 10);
		this.solicitudHipotecario = new SolicitudDeCreditoHipotecario(cliente, 4000d, 5);

	}
	
	@Test
	public void testConstructor() {
		assertEquals("Julian",cliente.getNombre());
		assertEquals("Villarroel",cliente.getApellido());
		assertEquals("Otamendi",cliente.getDireccion());
		assertEquals(23,cliente.getEdad());
		assertEquals(10000,cliente.getSueldoNetoMensual());
		assertEquals(garantia,cliente.getPropiedadInmobiliaria());
	}	

	@Test
	public void testSueldoAnual() {
		assertEquals(120000, cliente.getSueldoNetoAnual());
	}

	@Test
	public void testPedirPrestamo() {
		cliente.solicitarPrestamo(banco, solicitudPersonal);

		assertEquals(2000, banco.montoTotalDeDineroADesembolsar());

		cliente.solicitarPrestamo(banco, solicitudHipotecario);

		assertEquals(6000, banco.montoTotalDeDineroADesembolsar());
	}
}
