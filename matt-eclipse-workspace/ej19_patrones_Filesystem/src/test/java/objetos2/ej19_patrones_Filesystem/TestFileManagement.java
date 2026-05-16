package objetos2.ej19_patrones_Filesystem;

import java.util.Date;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFileManagement {

	FileOO2Interface file;
	@BeforeEach
	void setUp() throws Exception {
        file = new FileOO2(
                "report",
                "pdf",
                2048,
                new Date(1_700_000_000_000L),
                new Date(),
                "rw-r--r--"
        );

	}

	@Test
	void testNameExtPermissions() {
		file = new FileName(new FileExt(new FilePermissions(file)));
		
		System.out.println(file.prettyPrint());
	}

}
