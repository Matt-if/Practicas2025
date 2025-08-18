package objetos.dos.ej1_Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Socio solo tiene getters y setters, nada para testear.
 * Biblioteca solo hay que testear el exportarSocios() que usa directamente el exportar() publico de VorheesExporter.
 * Tres casos de prueba para exportar porque el formato de retorno cambia
 */

class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private String resultadoVacio, resultadoUnSocio, resultadoMasDeUnSocio;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		resultadoVacio = "[]";
		resultadoUnSocio = "[\n" 
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	}\n"
				+ "]";
		
		resultadoMasDeUnSocio = "[\n" 
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]";
	}
	
	@Test
	void testExportarSocio_Vacio() {
		assertEquals(resultadoVacio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_MasDeUno() {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		assertEquals(resultadoMasDeUnSocio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_SoloUno() {
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		assertEquals(resultadoUnSocio, biblioteca.exportarSocios());
	}
}
