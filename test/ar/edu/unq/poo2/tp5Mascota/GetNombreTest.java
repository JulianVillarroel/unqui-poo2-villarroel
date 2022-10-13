package ar.edu.unq.poo2.tp5Mascota;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp3.Persona;

class GetNombreTest {

	private Mascota mascota1;
	private Mascota mascota2;
	private Persona persona1;
	private Persona persona2;
	private ArrayList<SerVivo> lista;
	private LocalDate fecha1;
	private LocalDate fecha2;

	@BeforeEach
	public void setUp() {
		fecha1 = LocalDate.of(1998, Month.AUGUST, 28);
		fecha2 = LocalDate.of(1995, Month.MAY, 31);
		mascota1 = new Mascota("Samy", "sharpei");
		mascota2 = new Mascota("Sanson", "sharpei");
		persona1 = new Persona("Julian", fecha1);
		persona2 = new Persona("Xime", fecha2);
		lista = new ArrayList<SerVivo>();

		lista.add(mascota1);
		lista.add(mascota2);
		lista.add((SerVivo) persona1);
		lista.add((SerVivo) persona2);
	}

	@Test
	void testRegistrarProducto() {
		for (SerVivo serVivo : lista)

			System.out.println(serVivo.getNombre());
	}

}
