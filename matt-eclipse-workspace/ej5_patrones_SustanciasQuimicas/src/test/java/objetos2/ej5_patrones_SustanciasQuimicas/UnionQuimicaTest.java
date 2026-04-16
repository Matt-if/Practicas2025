package objetos2.ej5_patrones_SustanciasQuimicas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnionQuimicaTest {

	UnionQuimica OH, OHNa, NaCa, NaCl, OHNaCl;
	Atomo O, H, Ca, Na, Cl;
	ConstructorUniones CU;
	
	// Atomo(String simbolo, Integer pesoMolecular, Integer carga, Boolean metal)
	@BeforeEach
	void setUp() throws Exception {
		H = new Atomo("H", 1, 1, false);
		O = new Atomo("O", 16, -2, false);
		Cl = new Atomo("Cl", 35, -1, false);
		Na = new Atomo("Na", 23, 1, true);
		Ca = new Atomo("Ca", 40, 2, true);
		
		CU = new ConstructorUniones();
	}
	
	@Test
	void testUnionQuimicaFormula() {
		OH = CU.construirUnion(O, H);
		assertEquals("OH", OH.formula());
	}
	
	@Test
	void testPesoUnion() {
		OH = CU.construirUnion(O, H);
		assertEquals(17, OH.pesoMolecular());
	}
	
	@Test
	void testCargaUnion() {
		OH = CU.construirUnion(O, H);
		assertEquals(-1, OH.carga());
	}
	
	@Test
	void testAgregarAtomoAUnion() {
		OH = CU.construirUnion(O, H);
		OH.agregarElementoQuimico(Na);
		assertEquals("OHNa", OH.formula());
	}
	
	@Test
	void testUnionDeUniones () {
		OH = CU.construirUnion(O, H);
		NaCl = CU.construirUnion(Na, Cl);
		OHNaCl = CU.construirUnion(OH, NaCl);
		assertEquals("OHNaCl", OHNaCl.formula());
	}
	
	@Test
	void testUnionNoValida() {
		NaCl = CU.construirUnion(Na, Cl);
		
		assertFalse(NaCl.agregarElementoQuimico(Na));
	}

	/* dejo los tests viejos por las dudas, donde no usaba el contructor
	@Test
	void testUnionQuimicaFormula() {
		OH = new UnionQuimica(O, H);
		assertEquals("OH", OH.formula());
	}
	
	@Test
	void testPesoUnion() {
		OH = new UnionQuimica(O, H);
		assertEquals(17, OH.pesoMolecular());
	}
	
	@Test
	void testCargaUnion() {
		OH = new UnionQuimica(O, H);
		assertEquals(-1, OH.carga());
	}
	
	@Test
	void testUnionDeUniones () {
		OH = new UnionQuimica(O, H);
		NaCa = new UnionQuimica(Na, Ca);
		OHNaCa = new UnionQuimica(OH, NaCa);
		assertEquals("OHNaCa", OHNaCa.formula());
	}

	@Test
	void testAgregarAtomoAUnion() {
		OH = new UnionQuimica(O, H);
		OH.agregarElementoQuimico(Na);
		assertEquals("OHNa", OH.formula());
	}
	
	@Test
	void testEsValidaUnion() {
		OH = new UnionQuimica(O, H);
		OH.agregarElementoQuimico(Na);
		assertTrue(OH.esValida());
		
		NaCa = new UnionQuimica(Na, Ca);
		assertFalse(NaCa.esValida());
	}
	*/
}
