package ar.edu.unq.poo2.tp3.Ej1Contadores.contador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.Counter;

public class CounterTestCase {
private Counter counter;
/**
* Crea un escenario de test básico, que consiste en un contador
* con 10 enteros
*
* @throws Exception
*/
@BeforeEach
public void setUp() throws Exception {
//Se crea el contador
counter = new Counter();
//Se agregan los numeros. Un solo par y nueve impares
counter.addNumber(1);
counter.addNumber(3);
counter.addNumber(5);
counter.addNumber(7);
counter.addNumber(9);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(1);
counter.addNumber(4);
}
/**
* Verifica la cantidad de impares
*/

@Test
public void contarImpares() {
	
	int amount = counter.contarImpares();
	
	assertEquals(amount, 9);
}

/*
 * Verifica la cantidad de pares 
 */

@Test
public void contarPares() {

	int amount = counter.contarPares();
	
	assertEquals(amount, 1);
}


/*
 * verifica la cantidad de multiplos de un numero dado
 */

@Test
public void cantidadDeMultiplosDe() {
	int amount = counter.cantidadDeMultiplosDe(2);
	
	assertEquals(amount, 5);
}

}
