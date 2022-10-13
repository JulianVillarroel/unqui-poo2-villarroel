package ar.edu.unq.poo2.tp4ImpuestoEj3;

import java.time.Month;

public class IngresosPorHorasExtras extends Ingreso {

	private Integer cantidadDeHorasExtras;

	public IngresosPorHorasExtras(Month mes, String concepto, Integer monto, Integer cantidad) {
		super(mes, concepto, monto);
		cantidadDeHorasExtras = cantidad;
	}
	
	public Integer getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}
	
	public Integer getMontoImponible() {
		return 0;
	}
	
}
