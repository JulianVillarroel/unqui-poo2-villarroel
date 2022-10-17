package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

public class Contrincante implements Interes {

	private String nombre;

	public Contrincante(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Boolean chequearPartido(Partido partido) {
		Boolean resultado = false;
		for (String contrincante : partido.getContrincantes()) {
			resultado |= contrincante.equals(nombre);
		}
		return resultado;
	}

}
