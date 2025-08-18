package objetos.dos.ej6Patrones;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InscribirUsuarioTest {
	
	Excursion exc;
	Usuario us1, us2;
	LocalDate ini, fin;
	
	
	@BeforeEach
	void setUp() throws Exception {
		us1 = new Usuario("Pepe", "Mujica", "peMuj@gmail.com");
		us2 = new Usuario("Miguel", "Lopez", "milopez@gmail.com"); 
		ini = LocalDate.of(2025, 10, 5); // 5/10/25
		fin = LocalDate.of(2025, 10, 7);
		exc = new Excursion("Dos dias en kayak bajando el Parana", "puente Epico", ini, fin, 999.0, 1, 2);
		
	}

	@Test
	void testSinInscriptos() {
		//System.out.println(exc.obtenerInformacion());
	}
	
	@Test
	void test1Inscriptos() {
		exc.inscribir(us1);
		//System.out.println(exc.obtenerInformacion());
	}
	
	@Test
	void test2Inscriptos() {
		exc.inscribir(us1);
		exc.inscribir(us2);
		System.out.println(exc.obtenerInformacion());
	}

}
