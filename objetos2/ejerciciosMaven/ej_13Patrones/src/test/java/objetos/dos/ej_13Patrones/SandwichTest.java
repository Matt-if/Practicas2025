package objetos.dos.ej_13Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SandwichTest {
	
	DirectorDeSandwichs director;
	ConstructorDeClasico clasico;
	ConstructorDeSinTACC sintacc;
	ConstructorDeVegano vegano;
	ConstructorDeVegetariano vegetariano;
	Sandwich sanguche;
	
	@BeforeEach
	void setUp() throws Exception {
		director = new DirectorDeSandwichs();
		clasico = new ConstructorDeClasico();
		sintacc = new ConstructorDeSinTACC();
		vegano = new ConstructorDeVegano();
		vegetariano = new ConstructorDeVegetariano();
	}

	@Test
	void testClasico() {
		sanguche = director.construirSandwich(clasico);
		System.out.println(sanguche.toString());
		
	}
	
	@Test
	void testVegetariano() {
		sanguche = director.construirSandwich(vegetariano);
		System.out.println(sanguche.toString());
		
	}
	
	@Test
	void testVegano() {
		sanguche = director.construirSandwich(vegano);
		System.out.println(sanguche.toString());
		
	}
	
	@Test
	void testSinTacc() {
		sanguche = director.construirSandwich(sintacc);
		System.out.println(sanguche.toString());
		
	}

}
