package objetos2.ej1_RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwitterTest {

	Twitter tw_app = new Twitter();
	
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
	void testUserCreation() {
		assertNotNull(tw_app.createUser("pepe"));
		assertNull(tw_app.createUser("pepe"));
	}

	@Test
	void testTweetCreation() throws Exception {
		User u1 = tw_app.createUser("pepe");
		assertTrue(u1.tweet("mi primer tweet"));
		IllegalArgumentException voidTweet = assertThrows(IllegalArgumentException.class, () -> u1.tweet(""));
		IllegalArgumentException LongTweet = assertThrows(IllegalArgumentException.class, () -> u1.tweet("0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789e"));
	}
	
	//Faltarian tests por borrado de tweets

}
