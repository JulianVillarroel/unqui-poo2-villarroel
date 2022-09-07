package ar.edu.unq.poo2.tp3;

public class Rectangulo {
	private Punto puntoInicial;
	private int base;
	private int altura;
	
	
	public Rectangulo(Punto puntoInicial, int base, int altura) {
		this.puntoInicial = puntoInicial;
		this.base = base;
		this.altura = altura;
	}
	
	

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}


	public int area() {
		return this.getBase() * this.getAltura();
	}
	
	public int perimetro() {
		return 2 * (this.getBase() + this.getAltura());
	} 
	
	public Boolean esVertical() {
		return this.getAltura() > this.getBase(); 
	}
	
	public Boolean esHorizontal() {
		return this.getBase() > this.getAltura(); 
	}
}
