package objetos.dos.ej_10Patrones;

//faltaria el el constructor
// No darle mucha bola a "de donde sale la key". Se puede hacer un getKey() ponele y fue.
// Igualmente la clase que viene puedo preguntarle devuelta por las dudas.

public class RC4Adapter implements MecanismoDeCifrado {

	RC4 rc4;
	String key;
	
	public RC4Adapter(String key) {
		RC4 rc4 = new RC4();
		this.key = key;
	}
	
	@Override
	public String encriptar(String msj) {
		
		return rc4.encriptar(msj, this.getKey());
	}

	@Override
	public String desencriptar(String msj) {
		// TODO Auto-generated method stub
		return rc4.desencriptar(msj, this.getKey());
	}
	
	public String getKey() {
		return this.key;
	}
}
