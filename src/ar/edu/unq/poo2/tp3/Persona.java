package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaDeNacimiento;

	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public Integer edad() {
		LocalDate fechaDeNacimiento = this.getFechaDeNacimiento();
		LocalDate fechaActual = LocalDate.now();
		Integer edad = 0;

		if (fechaDeNacimiento.getMonthValue() < fechaActual.getMonthValue())
			edad = fechaActual.getYear() - fechaDeNacimiento.getYear();
		else
			edad = fechaActual.getYear() - fechaDeNacimiento.getYear() - 1;

		return edad;
	}

	public Boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}

}
