package ar.edu.unq.poo2.tp04ImpuestoEj3;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresosPercibidos;

	public Trabajador() {
		ingresosPercibidos = new ArrayList<Ingreso>();
	}

	public void addIngresosPercibidos(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}

	public Double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

	public Integer getMontoImponible() {
		Integer montoImponible = 0;
		for (Ingreso ingreso : ingresosPercibidos) {
			montoImponible += ingreso.getMontoImponible();
		}
		return montoImponible;
	}

	public Integer getTotalPercibido() {
		Integer impuestoAPagar = 0;
		for (Ingreso ingreso : ingresosPercibidos) {
			impuestoAPagar += ingreso.getMontoPercibido();
		}
		return impuestoAPagar;
	}

}
