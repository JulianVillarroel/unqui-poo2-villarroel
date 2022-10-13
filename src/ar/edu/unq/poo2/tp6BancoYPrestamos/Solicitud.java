package ar.edu.unq.poo2.tp6BancoYPrestamos;

public interface Solicitud {
	
	public Boolean realizarChequeo();
	public Double getMontoSolicitado();
	public Cliente getCliente();
}
