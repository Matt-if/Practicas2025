package objetos2.ej16_patrones_Excursiones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestInscripcionUsuario {

	User a, b, c;
	Excursion ex;
	
	@BeforeEach
	void setUp() throws Exception {
	    LocalDateTime ini = LocalDateTime.now();
	    LocalDateTime fin = LocalDateTime.of(2026, 4, 15, 0, 0);
	    
		ex = new Excursion("Dos dias en kayak", 1, 2, "La Plata terminal", ini, fin, 345.9);
		a = new User("", "", "");
		b = new User("", "", "");
		c = new User("", "", "");
	}

	@Test
	void testInscripcionLlena() {

		ex.inscribirUsuario(a);
		ex.inscribirUsuario(b);
		ex.inscribirUsuario(c);
		
		assertEquals(ex.getEspera().size(), 1);
	}
	
	@Test
	void testInscripcionOk() {

		ex.inscribirUsuario(a);
		ex.inscribirUsuario(b);
		
		assertEquals(ex.getInscriptos().size(), 2);
	}

}
