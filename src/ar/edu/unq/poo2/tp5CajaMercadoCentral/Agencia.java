package ar.edu.unq.poo2.tp5CajaMercadoCentral;

import java.util.List;

public interface Agencia {
	
	public void registrarPago(Factura factura);
	
	public List<Factura> getListaDeFactura();
}
