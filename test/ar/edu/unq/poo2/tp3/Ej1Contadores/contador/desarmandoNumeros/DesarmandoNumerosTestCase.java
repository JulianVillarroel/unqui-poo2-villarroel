package ar.edu.unq.poo2.tp3.Ej1Contadores.contador.desarmandoNumeros;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import java.util.List;

import org.junit.jupiter.api.Test;

public class DesarmandoNumerosTestCase {

	private static boolean esPar(int numero) {

		return numero % 2 == 0;
	}

	public static int daElNumeroConMayorDigitosPares(List<Integer> numeros) {

		int numeroConMayorDigitosPares = 0;

		for (int numero : numeros) {

			if (cantidadDeDigitosPares(numero) > cantidadDeDigitosPares(numeroConMayorDigitosPares)) {

				numeroConMayorDigitosPares = numero;

			}

		}

		return numeroConMayorDigitosPares;
	}

	public static int cantidadDeDigitosPares(int numero) {

		int digitoActual = 0;

		int cantidadDeDigitosPares = 0;

		while (numero != 0) {

			digitoActual = numero % 10;

			if (esPar(digitoActual)) {

				cantidadDeDigitosPares++;

			}
			;

			numero = numero / 10;

		}
		return cantidadDeDigitosPares;
	}

	@Test
	public void deUnArregloDeNumerosEnterosDevuelveElNumeroElNumeroConMayorDigitosPares() {

		List<Integer> numeros = Arrays.asList(12, 2, 322, 5);

		assertEquals(daElNumeroConMayorDigitosPares(numeros), 322);
	}

	@Test
	public void deUnArregloDeNumerosEnterosDevuelveElNumeroElPrimerNumeroConMayorDigitosPares() {

		List<Integer> numeros = Arrays.asList(122, 22, 2, 5);

		assertEquals(daElNumeroConMayorDigitosPares(numeros), 122);
	}

}
