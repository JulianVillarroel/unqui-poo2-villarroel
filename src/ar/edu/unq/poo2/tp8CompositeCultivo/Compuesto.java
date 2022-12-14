package ar.edu.unq.poo2.tp8CompositeCultivo;

import java.util.ArrayList;
import java.util.List;

public class Compuesto implements Cultivo {

	private List<Cultivo> cultivos;

	public Compuesto() {
		cultivos = new ArrayList<Cultivo>(4);
	}

	@Override
	public Double gananciaAnual() {
		Double resultado = 0d;
		for (Cultivo cultivo : cultivos) {
			resultado += cultivo.calcularGananciaAnual();
		}
		return resultado;
	}

	public void agregarCultivo(Cultivo cultivo) {
		cultivos.add(cultivo);
	}

	public void removerCultivo(Cultivo cultivo) {
		cultivos.remove(cultivo);
	}

	@Override
	public Double calcularGananciaAnual() {
		return gananciaAnual() / 4;
	}
}
