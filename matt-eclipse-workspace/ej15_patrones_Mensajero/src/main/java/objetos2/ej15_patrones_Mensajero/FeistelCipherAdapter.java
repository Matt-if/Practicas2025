package objetos2.ej15_patrones_Mensajero;

public class FeistelCipherAdapter implements EncryptionStrategy {
	
	private String mykey;
	private FeistelCipher fc;

	public FeistelCipherAdapter(String mykey) {
		super();
		this.mykey = mykey;
		fc = new FeistelCipher(mykey);
	}

	@Override
	public String encriptar(String msj) {
		
		return fc.encode(msj);
	}

	@Override
	public String desencriptar(String msjCifrado) {
		return fc.encode(msjCifrado);
	}

}
