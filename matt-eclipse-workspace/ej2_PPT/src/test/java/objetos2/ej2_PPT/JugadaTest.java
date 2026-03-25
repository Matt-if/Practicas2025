package objetos2.ej2_PPT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadaTest {

	Piedra p = new Piedra();
	Papel pa = new Papel();
	Tijera t = new Tijera();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testPiedra() {
		assertEquals("Gana Piedra", p.jugarContra(t));
		assertEquals("Empate", p.jugarContra(p));
		assertEquals("Gana Papel", p.jugarContra(pa));
	}

}
