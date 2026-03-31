package objetos2.ej3bis_Refactoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IntRingTest {

	IntRing arr;
	
	@BeforeEach
	void setUp() throws Exception {
		arr = new IntRing(new int [] {1,2,3});
	}

	@Test
	void testNext() {
		assertEquals(1, arr.next());
		assertEquals(2, arr.next());
		assertEquals(3, arr.next());
		assertEquals(1, arr.next());
	}
}
