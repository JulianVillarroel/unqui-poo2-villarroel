package ar.edu.unq.poo2.tp6Email;

import java.util.ArrayList;

public class BandejaDeEmail {

	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;

	public BandejaDeEmail() {
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
	}

	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}

	public int contarBorrados() {
		return this.borrados.size();
	}

	public int contarInbox() {
		return this.inbox.size();
	}

	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}

}
