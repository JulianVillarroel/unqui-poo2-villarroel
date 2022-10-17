package ar.edu.unq.poo2.tp8CompositeCultivo;

public class Soja implements Cultivo {

	@Override
	public Double gananciaAnual() {

		return 500d;
	}

	@Override
	public Double calcularGananciaAnual() {

		return this.gananciaAnual() / 4;
	}
}
