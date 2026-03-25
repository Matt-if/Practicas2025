package objetosDos.ej1RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestUser {
	User p, pp;
	Tweet t1, t2, t3, t4;
	ReTweet rt;
	String body0, bodyOk, body281;

	@BeforeEach
	void setUp() throws Exception {
		p = new User("pepe");
		pp = new User("pepito");
		
		body0 = "";
		bodyOk = "que objetoso me encuentro";
		body281 = "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
				+ "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"
				+ "12345678901234567890123456789012345678901234567890123456789012345678901234567890A";

	}

	@Test
	void testTwitear() {
	
		t1 = new Tweet(bodyOk);
		t2 = new Tweet(body281);
		t3 = new Tweet(body281);
		
		assertTrue(p.twitear(t1));
		assertFalse(p.twitear(t2));
		assertFalse(p.twitear(t3));
	}
	
	void agregarTweets () {
	
		t1 = new Tweet("hola");
		t2 = new Tweet("hola2");
		t4 = new Tweet("hola4");
		rt = new ReTweet(t1);
		
		p.twitear(t1);
		p.twitear(t2);
		
		pp.reTwitear(t1);
		pp.twitear(t4);
	}
	
	@Test
	void testDeleteTweetsFrom() {
		this.agregarTweets();
		
		assertEquals(2, pp.getTweets().size());
		
		pp.deleteTweetsFrom(p);
		
		assertEquals(1, pp.getTweets().size());
		
		assertTrue(pp.getTweets().get(0) == t4);
	}

}
