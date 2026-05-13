package objetos2.ej15_patrones_Mensajero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MensajeroTest {

	Mensajero m;
	RC4Adapter rc4a;
	FeistelCipherAdapter fca;
	String msjEnvio, msjEnviadoEncriptado, msjRecibidoDesencriptado;
	
	@BeforeEach
	void setUp() throws Exception {
		rc4a = new RC4Adapter("magickey", new RC4());
		fca = new FeistelCipherAdapter("magickey");
		msjEnvio = "Mensaje de prueba";
	}

	@Test
	void testCifradoYDescifradoConFeistel() {
		m = new Mensajero(fca);
		msjEnviadoEncriptado = m.enviar(msjEnvio);
		msjRecibidoDesencriptado = m.recibir(msjEnviadoEncriptado);
		
		assertEquals(msjEnvio, msjRecibidoDesencriptado);
		
	}
	
	@Test
	void testFeistelEnvioYRC4Envio() {
		m = new Mensajero(fca);
		
		msjEnviadoEncriptado = m.enviar(msjEnvio);
		
		m.setEncryptionStrategy(rc4a);
		
		msjEnviadoEncriptado = m.enviar(msjEnvio);
		
		msjRecibidoDesencriptado = m.recibir(msjEnviadoEncriptado);
		
		assertEquals(msjEnvio, msjRecibidoDesencriptado);
		
	}

}
