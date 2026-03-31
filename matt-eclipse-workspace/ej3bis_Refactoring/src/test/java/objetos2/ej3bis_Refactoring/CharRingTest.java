package objetos2.ej3bis_Refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CharRingTest {
	
	CharRing arr;
	
	@BeforeEach
	void setUp() throws Exception {
		arr = new CharRing("abc");
	}

	@Test
	void testNext() {
		assertEquals('a', arr.next());
		assertEquals('b', arr.next());
		assertEquals('c', arr.next());
		assertEquals('a', arr.next());
	}
}
