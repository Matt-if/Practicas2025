package objetos2.ej15_patrones_Mensajero;

public class Mensajero {

	private EncryptionStrategy es;
	
	public Mensajero(EncryptionStrategy es) {
		super();
		this.es = es;
	}

	public String enviar (String msj) {
		return es.encriptar(msj);
	}
	
	public String recibir (String msj) {
		return es.desencriptar(msj);
	}
	
	public void setEncryptionStrategy (EncryptionStrategy es) {
		this.es = es;
	}
}
