package ar.edu.unq.poo2.tp6BancoYPrestamos;

import java.util.HashSet;
import java.util.Set;

public class Banco {

	private Set<Cliente> listaDeClientes;
	private Set<Solicitud> listaDeSolicitudes;

	public Banco() {
		this.listaDeClientes = new HashSet<Cliente>();
		this.listaDeSolicitudes = new HashSet<Solicitud>();
	}

	public Double otorgarPrestamo(Solicitud solicitud) {
		if (this.evaluarSolicitud(solicitud)) {
			return this.desembolsarMontoEnEfectivo(solicitud);
		}
		return 0d;
	}

	public Double desembolsarMontoEnEfectivo(Solicitud solicitud) {
		return solicitud.getMontoSolicitado();
	}

	public Boolean evaluarSolicitud(Solicitud solicitud) {
		return solicitud.realizarChequeo();
	}

	public void registrarCliente(Cliente cliente) {
		this.listaDeClientes.add(cliente);
	}

	public void registrarSolicitud(Solicitud solicitud) {
		if (this.esCliente(solicitud.getCliente())) {

		}
		this.listaDeSolicitudes.add(solicitud);
	}

	private boolean esCliente(Cliente cliente) {
		return this.listaDeClientes.contains(cliente);
	}

	public Double montoTotalDeDineroADesembolsar() {
		Double montoTotal = 0d;
		for (Solicitud solicitud : this.listaDeSolicitudes) {
			montoTotal += solicitud.getMontoSolicitado();
		}
		return montoTotal;
	}

	public Set<Cliente> getClientes() {
		return listaDeClientes;
	}

}
