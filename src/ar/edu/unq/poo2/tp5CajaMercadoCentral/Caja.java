package ar.edu.unq.poo2.tp5CajaMercadoCentral;

public class Caja {
	private Double registrar(Pagable pagable) {
		return pagable.registrar();
	}
	
	public Double informarMontoAPagar(Cliente cliente) {
		Double montoAPagar = 0d;
		for (Pagable pagable: cliente.getListaDePagables())
			montoAPagar += this.registrar(pagable);
		
	return montoAPagar;
	}
}
