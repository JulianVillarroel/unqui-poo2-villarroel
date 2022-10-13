package ar.edu.unq.poo2.tp5CajaMercadoCentral;

public class FacturaDeServicio extends Factura{
	
	private Double costePorUnidadConsumida;
	private Double cantidadDeUnidadesConsumidas;
	
	
	public FacturaDeServicio(Double costePorUnidadConsumida, Double cantidadDeUnidadesConsumidas, Agencia agencia) {
		super(agencia);
		this.costePorUnidadConsumida = costePorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	
	@Override
	protected Double getMontoAPagar() {
		return this.costePorUnidadConsumida * this.cantidadDeUnidadesConsumidas;
	}
}
