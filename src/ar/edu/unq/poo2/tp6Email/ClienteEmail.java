package ar.edu.unq.poo2.tp6Email;

public class ClienteEmail {
	private IServidorPop servidor;
	private String nombreUsuario;
	private String passUsuario;
	private BandejaDeEmail bandeja;

	public ClienteEmail(IServidorPop servidor, String nombreUsuario, String pass) {
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = pass;
		this.bandeja = new BandejaDeEmail();
		this.conectar();
	}

	public void conectar() {
		this.servidor.conectar(this.nombreUsuario, this.passUsuario);
	}

	public void recibirNuevos() {
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}

	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}
}
