package ar.edu.unq.poo2.tp8ObserverPublicaciones;

import java.util.List;

public class Articulo {

	private List<String> afiliaciones;
	private String titulo;
	private List<String> autores;
	private String editorial;
	private String tipo;
	private List<String> palabrasClaves;

	public Articulo(List<String> listaDeAfiliaciones, String titulo, List<String> listaDeAutores, String editorial,
			String tipo, List<String> palabrasClaves) {

		this.afiliaciones = listaDeAfiliaciones;
		this.titulo = titulo;
		this.autores = listaDeAutores;
		this.tipo = tipo;
		this.editorial = editorial;
		this.palabrasClaves = palabrasClaves;
	}

	public List<String> getAfiliaciones() {
		return afiliaciones;
	}

	public String getTitulo() {
		return titulo;
	}

	public List<String> getAutores() {
		return autores;
	}

	public String getEditorial() {
		return editorial;
	}

	public String getTipo() {
		return tipo;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}

}
