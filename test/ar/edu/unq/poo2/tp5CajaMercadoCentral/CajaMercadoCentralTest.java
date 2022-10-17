package ar.edu.unq.poo2.tp5CajaMercadoCentral;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaMercadoCentralTest {

	private Caja caja;
	private Producto productoDeCooperativa;
	private Producto productoDeEmpresaTradicional;
	private Cliente cliente;
	private Factura facturaServicios;
	private Factura facturaImpuestos;
	private Agencia agenciaRecaudadora;
	
	
	@BeforeEach
	public void setUp() {
		agenciaRecaudadora = new AgenciaRecaudadora();
		caja = new Caja();
		productoDeCooperativa = new ProductoDeCooperativa(100d, 5);
		productoDeEmpresaTradicional = new ProductoDeEmpresaTradicional(200D, 10);
		cliente = new Cliente();
		facturaServicios = new FacturaDeServicio(1000d, 10d, agenciaRecaudadora);
		facturaImpuestos = new FacturaDeImpuestos(800d, agenciaRecaudadora);
		
		cliente.agregarAListaDeCosasAPagar(productoDeCooperativa);
		cliente.agregarAListaDeCosasAPagar(productoDeEmpresaTradicional);
		
	}
	
	@Test
	void testRegistrarProducto() {
		Double precioDelProducto = productoDeCooperativa.registrar();
		
		assertEquals(90, precioDelProducto);
		assertEquals(4, productoDeCooperativa.getStock());
		
		Double precioDelProducto2 = productoDeEmpresaTradicional.registrar();
		
		assertEquals(200, precioDelProducto2);
		assertEquals(9, productoDeEmpresaTradicional.getStock());
		
		
		Double montoAPagarDeFactura = facturaServicios.registrar();
		Double montoAPagarDeFactura2 = facturaImpuestos.registrar();
		
		assertEquals(10000, montoAPagarDeFactura);
		assertEquals(800, montoAPagarDeFactura2);
	}
	
	
	@Test
	void testInformarMontoAPagar() {
		Double montoAPagar = caja.informarMontoAPagar(cliente);
		
		assertEquals(290, montoAPagar);
		
		cliente.agregarAListaDeCosasAPagar(facturaServicios);
		cliente.agregarAListaDeCosasAPagar(facturaImpuestos);
		
		Double montoAPagar2 = caja.informarMontoAPagar(cliente);
		
		assertEquals(11090, montoAPagar2);
	}
	
}








