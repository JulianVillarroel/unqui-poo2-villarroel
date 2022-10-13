package ar.edu.unq.poo2.tp5CajaMercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class AgenciaRecaudadora implements Agencia {

	private List<Factura> listaDeFacturas;

	public AgenciaRecaudadora() {
		listaDeFacturas = new ArrayList<Factura>();
	}
	
	
	public List<Factura> getListaDeFactura() {
		return listaDeFacturas;
	}
	

	@Override
	public void registrarPago(Factura factura) {
		listaDeFacturas.add(factura);
	}

	
}
