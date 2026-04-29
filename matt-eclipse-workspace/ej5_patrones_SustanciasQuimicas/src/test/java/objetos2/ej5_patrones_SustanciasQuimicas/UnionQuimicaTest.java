package objetos2.ej5_patrones_SustanciasQuimicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnionQuimicaTest {

	UnionQuimica OH, OHNa, NaCa, NaCl, OHNaCl;
	Atomo O, H, Ca, Na, Cl;
	ConstructorElementoQuimico Constructor;
	
	// Atomo(String simbolo, Integer pesoMolecular, Integer carga, Boolean metal)
	@BeforeEach
	void setUp() throws Exception {
		Constructor = new ConstructorElementoQuimico();
		
		H = Constructor.construirHidrogeno();
		O = Constructor.construirOxigeno();
		Cl = Constructor.construirCloro();
		Na = Constructor.construirSodio();
		Ca = Constructor.construirCalcio();
		
		OH = Constructor.construirUnion(List.of(O, H));
	}

	
	@Test
	void testUnionQuimicaFormula() {

		assertEquals("OH", OH.formula());
	}
	
	@Test
	void testPesoUnion() {

		assertEquals(17, OH.pesoMolecular());
	}
	
	@Test
	void testCargaUnion() {
		assertEquals(-1, OH.carga());
	}
	
	@Test
	void testAgregarAtomoAUnion() {
		OH.agregarElementoQuimico(Na);
		assertEquals("OHNa", OH.formula());
	}
	
	@Test
	void testUnionDeUniones () {
	}
	
	@Test
	void testUnionNoValida() {

	}

}
