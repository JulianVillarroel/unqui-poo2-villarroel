package ar.edu.unq.poo2.tp3.Ej11;

public class Persona {
	private String nombre;
	private String apellido;
	private Integer edad;

	public Persona(String nombre, String apellido, Integer edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}

}
