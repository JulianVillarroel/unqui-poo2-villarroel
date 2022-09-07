package ar.edu.unq.poo2.tp3;

public class Cuadrado extends Rectangulo {
	
	public Cuadrado(Punto puntoInicial, int lado) {
		super(puntoInicial, lado, lado);
	}
	
	public Boolean esVertical() {
		return true;
	}
	
	public Boolean esHorizontal() {
		return true;
	}
	
}
