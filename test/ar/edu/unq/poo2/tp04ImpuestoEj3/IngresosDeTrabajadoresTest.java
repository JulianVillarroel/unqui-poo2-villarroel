package ar.edu.unq.poo2.tp04ImpuestoEj3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresosDeTrabajadoresTest {

	private Trabajador empleado;
	private Ingreso ingreso1;
	private IngresosPorHorasExtras ingresosPorHoras;

	@BeforeEach
	public void setUp() {
		empleado = new Trabajador();
		ingreso1 = new Ingreso(Month.MAY, "Hola", 1000);
		ingresosPorHoras = new IngresosPorHorasExtras(Month.MAY, "Hola", 1000, 4);

		empleado.addIngresosPercibidos(ingreso1);
		empleado.addIngresosPercibidos(ingresosPorHoras);
	}

	@Test
	public void testConstructor() {
		assertEquals("Hola", ingreso1.getConcepto());
		assertEquals(Month.MAY, ingreso1.getMesDePercepcion());
		assertEquals(4, ingresosPorHoras.getCantidadDeHorasExtras());
	}

	@Test
	public void testImpuestos() {
		Double impuestoAPagar = empleado.getImpuestoAPagar();
		Integer montoImponible = empleado.getMontoImponible();
		Integer totalPercibido = empleado.getTotalPercibido();

		assertEquals(20, impuestoAPagar);
		assertEquals(1000, montoImponible);
		assertEquals(2000, totalPercibido);

	}

}
