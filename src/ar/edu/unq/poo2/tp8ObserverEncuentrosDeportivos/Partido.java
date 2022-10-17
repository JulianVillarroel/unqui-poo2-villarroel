package ar.edu.unq.poo2.tp8ObserverEncuentrosDeportivos;

import java.util.List;

public class Partido {
	
	private String deporte;
	private List<String> contrincantes;
	private String resultado;
	
	public Partido(String deporte, List<String> contrincantes, String resultado) {
		this.deporte = deporte;
		this.contrincantes = contrincantes; 
		this.resultado = resultado;
	}

	public String getDeporte() {
		return deporte;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public String getResultado() {
		return resultado;
	}

}
