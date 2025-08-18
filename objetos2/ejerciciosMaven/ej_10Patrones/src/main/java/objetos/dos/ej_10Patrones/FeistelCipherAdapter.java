package objetos.dos.ej_10Patrones;

public class FeistelCipherAdapter implements MecanismoDeCifrado {
	FeistelCipher fc;

	public FeistelCipherAdapter(String key) {
		fc = new FeistelCipher(key);
	}

	@Override
	public String encriptar(String msj) {
		
		return fc.encode(msj);
	}

	@Override
	public String desencriptar(String msj) {
		
		return fc.encode(msj);
	}

}
