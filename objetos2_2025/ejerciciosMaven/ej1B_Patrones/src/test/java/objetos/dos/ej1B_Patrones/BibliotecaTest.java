package objetos.dos.ej1B_Patrones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * El JSON se construye bien, el tema es que queda formateado en una linea en vez de pretty printed y ademas pueden quedar desordenados los key-value.
 * Como se tiene que testear esto ??
 */

class BibliotecaTest {
	
	private Biblioteca biblioteca;
	private String resultadoVacio, resultadoUnSocio, resultadoMasDeUnSocio;
	private JSONsimpleAdapter jsonSimple;
	private JacksonAdapter jackson;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		jsonSimple = new JSONsimpleAdapter();
		jackson = new JacksonAdapter();
		
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
	void testExportarSocio_Vacio_JSONSimple() {
		biblioteca.setExporter(jsonSimple);
		assertEquals(resultadoVacio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_SoloUno_JSONSimple() {
		biblioteca.setExporter(jsonSimple);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		assertEquals(resultadoUnSocio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_MasDeUno_JSONSimple() {
		biblioteca.setExporter(jsonSimple);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		assertEquals(resultadoMasDeUnSocio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_Vacio_Jackson() {
		biblioteca.setExporter(jackson);
		assertEquals(resultadoVacio, biblioteca.exportarSocios());
	}
	

	@Test
	void testExportarSocio_SoloUno_Jackson() {
		biblioteca.setExporter(jackson);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		assertEquals(resultadoUnSocio, biblioteca.exportarSocios());
	}
	
	@Test
	void testExportarSocio_MasDeUno_Jackson() {
		biblioteca.setExporter(jackson);
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		assertEquals(resultadoMasDeUnSocio, biblioteca.exportarSocios());
	}
}
