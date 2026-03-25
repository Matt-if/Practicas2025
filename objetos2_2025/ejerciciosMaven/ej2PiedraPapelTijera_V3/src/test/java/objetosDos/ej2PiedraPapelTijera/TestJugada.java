package objetosDos.ej2PiedraPapelTijera;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestJugada {
	
	private Jugada Piedra, Papel, Tijera, Spock, Lagarto;
	
	@BeforeEach
	void setUp() throws Exception {
		Piedra = new Piedra();
		Tijera = new Tijera();
		Papel = new Papel();
		Spock = new Spock();
		Lagarto = new Lagarto();
	}

	@Test
	void testPiedra() {
		assertEquals("Empate", Piedra.jugarContra(Piedra));
		
		assertEquals("Gana Piedra", Piedra.jugarContra(Tijera));
		
		assertEquals("Gana Spock", Piedra.jugarContra(Spock));
		
		assertEquals("Gana Papel", Piedra.jugarContra(Papel));
	}
	
	@Test
	void testPapel() {

	}

}
