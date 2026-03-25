package objetosDos.ej1RedSocial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestTwitter {
	
	Twitter T;
	User p, pp;
	Tweet t1, t2;
	ReTweet rt;
	
	@BeforeEach
	void setUp() throws Exception {
		T = new Twitter();
		
	}

	@Test
	void testAddUser() {
		p = new User("pepe");
		assertTrue(T.addUser(p));
		
		pp = new User("pepe");
		assertFalse(T.addUser(pp));
	}
	
	void agregarUsuariosYTweets () {
		p = new User("pepe");	
		pp = new User("pepito");
		
		t1 = new Tweet("hola");
		t2 = new Tweet("hola2");
		rt = new ReTweet(t1);
		
		T.addUser(p);
		T.addUser(pp);
		
		p.twitear(t1);
		p.twitear(t2);
		pp.reTwitear(t1);
	}
	
	@Test
	void testDeleteUser () {
		this.agregarUsuariosYTweets();
		
		assertEquals(2, T.getUsers().size());
		
		assertEquals(1, pp.getTweets().size());
		
		T.delUser(p);
		
		assertEquals(1, T.getUsers().size());
		
		assertEquals(0, pp.getTweets().size());
		
	}

}
