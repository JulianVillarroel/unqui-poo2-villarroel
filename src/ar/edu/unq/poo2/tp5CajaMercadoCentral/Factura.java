package ar.edu.unq.poo2.tp5CajaMercadoCentral;

public abstract class Factura implements Pagable{
	
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}
	
	@Override
	public Double registrar() {
		agencia.registrarPago(this);
		
		return this.getMontoAPagar();
	}
	
	protected abstract Double getMontoAPagar();

}
