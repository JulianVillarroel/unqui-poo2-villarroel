package ar.edu.unq.poo2.tp6BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SolicitudTest {

	private SolicitudDeCredito solicitudPersonal;
	private SolicitudDeCreditoHipotecario solicitudHipotecario;
	private Cliente cliente1;
	private Cliente cliente2;
	private PropiedadInmobiliaria garantia1;
	private PropiedadInmobiliaria garantia2;
	private Cliente cliente3;

	@Before
	public void setUp() {
		garantia1 = new PropiedadInmobiliaria("departamento", "Otamendi", 8000);
		garantia2 = new PropiedadInmobiliaria("terreno", "Otamendi", 40);

		this.cliente1 = new Cliente("Julian", "Villarroel", "Otamendi", 23, 10000d, garantia1);
		this.cliente2 = new Cliente("Julian", "Villarroel", "Otamendi", 65, 1000d, garantia2);
		this.cliente3 = new Cliente("Julian", "Villarroel", "Otamendi", 65, 1000d, garantia1);

		this.solicitudPersonal = new SolicitudDeCreditoPersonal(cliente1, 2000d, 10);
		this.solicitudHipotecario = new SolicitudDeCreditoHipotecario(cliente1, 4000d, 5);
	}

	@Test
	public void testConstructor() {
		assertEquals(cliente1, solicitudPersonal.getCliente());
		assertEquals(2000, solicitudPersonal.getMontoSolicitado());
		assertEquals(10, solicitudPersonal.getCuotasMensuales());
		assertEquals(garantia1, solicitudHipotecario.getGarantia());
	}

	@Test
	public void testMontoCuotasMensuales() {
		assertEquals(200, solicitudPersonal.getMontoDeCuotaMensual());
		assertEquals(800, solicitudHipotecario.getMontoDeCuotaMensual());
	}

	@Test
	public void testRealizarChequeoEnSolicitudesAceptadas() {
		assertTrue(solicitudPersonal.realizarChequeo());
		assertTrue(solicitudHipotecario.realizarChequeo());
	}

	@Test
	public void testRealizarChequeoEnSolicitudesRechazadasPorMontoDeCuota() {
		SolicitudDeCredito solicitudPersonalRechazadaPorMontoDeCuota = new SolicitudDeCreditoPersonal(cliente3, 8000d,
				1);
		SolicitudDeCredito solicitudHipotecarioRechazadaPorMontoDeCuota = new SolicitudDeCreditoHipotecario(cliente1,
				6000d, 1);

		assertFalse(solicitudPersonalRechazadaPorMontoDeCuota.realizarChequeo());
		assertFalse(solicitudHipotecarioRechazadaPorMontoDeCuota.realizarChequeo());
	}

	@Test
	public void testRealizarChequeoEnSolicitudesHipotecariaRechazadasPorMontoTotal() {
		SolicitudDeCredito solicitudHipotecarioRechazadaPorMontoTotal = new SolicitudDeCreditoHipotecario(cliente2,
				4000d, 5);

		assertFalse(solicitudHipotecarioRechazadaPorMontoTotal.realizarChequeo());
	}

	@Test
	public void testRealizarChequeoEnSolicitudPersonalRechazadaPorIngresoAnual() {
		SolicitudDeCredito solicitudPersonalRechazadaPorIngresoAnual = new SolicitudDeCreditoPersonal(cliente2, 2000d,
				10);

		assertFalse(solicitudPersonalRechazadaPorIngresoAnual.realizarChequeo());
	}

	@Test
	public void testRealizarChequeoEnSolicitudHipotecariaRechazadaPorSerMayorDe65AñosAlTerminarDePagar() {
		SolicitudDeCredito solicitudHipotecarioRechazadaPorMontoTotal = new SolicitudDeCreditoHipotecario(cliente3,
				4000d, 15);

		assertFalse(solicitudHipotecarioRechazadaPorMontoTotal.realizarChequeo());
	}

}
