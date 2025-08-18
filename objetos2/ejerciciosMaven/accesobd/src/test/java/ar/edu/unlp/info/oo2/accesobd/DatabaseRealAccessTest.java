package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseAccessProxy proxyDB;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.proxyDB = new DatabaseAccessProxy();
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testGetSearchResults_PROXY_Logged() {
    	proxyDB.login("abc123");
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.proxyDB.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.proxyDB.getSearchResults("select * from comics where id=10"));
    }
    
    @Test
    void testInsertNewRow_PROXY_Logged() {
    	proxyDB.login("abc123");
        assertEquals(3, this.proxyDB.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.proxyDB.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    void testGetSearchResults_PROXY_NOT_Logged() {

        assertNull(this.proxyDB.getSearchResults("select * from comics where id=1"));
        assertNull(this.proxyDB.getSearchResults("select * from comics where id=10"));
    }
    
	@Test
    void testInsertNewRow_PROXY_NOT_Logged() {
        
        assertEquals(-1, this.proxyDB.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertNull(this.proxyDB.getSearchResults("select * from comics where id=3"));
    }
    
}
