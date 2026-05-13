package objetos2.ej15_patrones_Mensajero;

public class RC4Adapter implements EncryptionStrategy {

	private String mykey;
	private RC4 rc4;
	
	public RC4Adapter(String mykey, RC4 rc4) {
		this.mykey = mykey;
		this.rc4 = rc4;
	}

	@Override
	public String encriptar(String msj) {
		return rc4.encriptar(msj, mykey);
	}

	@Override
	public String desencriptar(String msjCifrado) {
		return rc4.desencriptar(msjCifrado, mykey);
	}

}
