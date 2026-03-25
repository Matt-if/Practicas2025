package objetos.dos.ej_11Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MixtaTest {
	Agua a;
	Tierra t;
	Pantano p;
	Mixta mix, mix2, mix3;
	@BeforeEach
	void setUp() throws Exception {
		a = new Agua();
		t = new Tierra();
		p = new Pantano();
		mix = new Mixta(a, t, a, t); //prop agua = 0.5
		mix2 = new Mixta(a, a, a, mix); //prop agua = (3 + 1/8) / 4 = 0.78125
		mix3 = new Mixta(a, a, mix2, mix);
	}

	@Test
	void testEsIgual() {
		assertTrue(a.esIgual(a));
		assertFalse(a.esIgual(t));
		assertTrue(t.esIgual(t));
		assertTrue(p.esIgual(p));
		assertTrue(mix.esIgual(mix));
	}
	
	@Test
	void testProporciones() {
		assertEquals(0.5, mix.calcularProporcionDeAgua());
		
		assertEquals(0.78, mix2.calcularProporcionDeAgua(), 2); //con dos decimales
	}
	
	@Test
	void testEsIgualComplejo() {
		assertTrue(mix2.esIgual(mix2));
		assertFalse(mix3.esIgual(mix2));
	}

}
