package objetos.dos.ej2Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {
	
	private EmpleadoTemporario emp;
	private boolean casado;
	private int cantHijos;
	private int hsTrabajdas;
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	double calcularValorEsperado (boolean casado, int cantHijos, int hsTraba) {
		
		double matrimonio = casado ? 5000 : 0;
		double basico = 20000 + hsTraba * 300;
		double adicional = matrimonio + cantHijos * 2000;
		
		return basico + adicional - (basico*0.13 + adicional * 0.05);
	}

	@Test
	void testSueldo() {
		casado = false;
		cantHijos = 0;
		hsTrabajdas = 0;
		double res = this.calcularValorEsperado(casado, cantHijos, hsTrabajdas);
		
		emp = new EmpleadoTemporario("pepe",cantHijos, casado, hsTrabajdas);
		
		assertEquals(res, emp.sueldo());
	}
	
	@Test
	void testSueldo2() {
		casado = true;
		cantHijos = 0;
		hsTrabajdas = 0;
		double res = this.calcularValorEsperado(casado, cantHijos, hsTrabajdas);
		
		emp = new EmpleadoTemporario("pepe",cantHijos, casado, hsTrabajdas);
		
		assertEquals(res, emp.sueldo());
	}
	
	@Test
	void testSueldo3() {
		casado = true;
		cantHijos = 3;
		hsTrabajdas = 0;
		double res = this.calcularValorEsperado(casado, cantHijos, hsTrabajdas);
		
		emp = new EmpleadoTemporario("pepe",cantHijos, casado, hsTrabajdas);
		
		assertEquals(res, emp.sueldo());
	}
	
	@Test
	void testSueldo4() {
		casado = true;
		cantHijos = 3;
		hsTrabajdas = 43;
		double res = this.calcularValorEsperado(casado, cantHijos, hsTrabajdas);
		
		emp = new EmpleadoTemporario("pepe",cantHijos, casado, hsTrabajdas);
		
		assertEquals(res, emp.sueldo());
	}

}
