package objetos.dos.ej7Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	Calculadora calc;
	
	@BeforeEach
	void setUp() throws Exception {
		calc = new Calculadora();
	}

	@Test
	void test() {
		calc.setValor(5); // Establece el valor inicial 
		calc.mas(); // Prepara para sumar 
		calc.setValor(3); // Suma 3 al valor acumulado 
		System.out.println(calc.getResultado()); // Imprimirá "8.0"
		calc.por();
		calc.setValor(2);
		assertEquals(calc.getResultado(), "16.0");
	}
	
	@Test
	void testError() {
		calc.setValor(5); // Establece el valor inicial 
		calc.mas(); // Prepara para sumar 
		calc.mas();
		assertEquals("Error", calc.getResultado());
	}
	
	@Test
	void testDiv0() {
		calc.setValor(5); // Establece el valor inicial 
		calc.dividido(); // Prepara para sumar 
		calc.setValor(0);
		assertEquals("Error", calc.getResultado());
	}
	
	@Test
	void testBorrar() {
		calc.setValor(5); // Establece el valor inicial 
		calc.dividido(); // Prepara para sumar 
		calc.setValor(0);
		assertEquals("Error", calc.getResultado());
		calc.borrar();
		calc.setValor(10);
		calc.por();
		calc.setValor(3);
		assertEquals("30.0", calc.getResultado());
	}

}
