package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumber(int i) {
		this.numeros.add(i);
	}

	public int contarImpares() {
		int imparesVistos = 0;
		for(int i = 0; i<longitudDeLista(); i++) {
			if (esImpar(i)) {
				imparesVistos++;
			}
		}
		return imparesVistos;
	}

	public int contarPares() {
		int paresVistos = 0;
		for(int i=0; i<longitudDeLista(); i++) {
			if (esPar(i)) {
				paresVistos++;
			}
		}
		return paresVistos;
	}

	private int longitudDeLista() {
		return this.numeros.size();
	}

	private boolean esPar(int i) {
		return this.numeros.get(i) % 2 == 0;
	}
	
	private boolean esImpar(int i) {
		return !(esPar(i));
	}

	public int cantidadDeMultiplosDe(int q) {
		int multiplosVistos = 0;
		for(int i = 0; i<longitudDeLista(); i++) {
			if (esMultiploDe(i, q)) {
				multiplosVistos++;
			}
		}
		return multiplosVistos;
	}

	private boolean esMultiploDe(int num1, int num2) {
		return (num1 % num2 == 0);
	}
	
}

/*
  foreach
  
	  public int contarImpares() {
			int imparesVistos = 0;
			for(int numero:this.numeros) {
				if (esImpar(i)) {
					imparesVistos++;
				}
			}
			return imparesVistos;
		}
 */


