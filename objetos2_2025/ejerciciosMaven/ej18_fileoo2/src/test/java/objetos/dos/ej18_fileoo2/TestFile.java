package objetos.dos.ej18_fileoo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFile {
	File f;
	FileOO2 fReal;

	@BeforeEach
	void setUp() throws Exception {
		fReal = new FileOO2(
	            "documento",         // nombre
	            "15KB",              // tamaño
	            "txt",               // extensión
	            "2024-01-01",        // fecha de creación
	            "2025-05-13",        // fecha de modificación
	            "rwx"                // permisos
	        );
		
		
	}
	
	@Test
	void testNombreExtension() {
		f = new NombreDecorator(
				new ExtensionDecorator(
						fReal));
		
		assertEquals("txt documento", f.prettyPrint());
	}

}
