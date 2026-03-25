package objetosDos.ej1RedSocial;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
	private String screenName;
	private List<Publicacion> tweets;
	
	public User(String screenName) {
		tweets = new ArrayList<Publicacion>();
		this.screenName = screenName;
	}
	
	public boolean twitear (Tweet t) {
		if (t.isBodyLengthOk()) return tweets.add(t);
		
		return false;
	}
	
	public boolean reTwitear (Tweet t) {
		return tweets.add(new ReTweet(t));
	}
	
	public String getScreenName() {
		return screenName;
	}
	
	//Primero me dijeron que era necesario, despues que no.
	// Porque el garbage collector se encarga de eliminar la lista de usuarios porque despues de borrar la lista de usuarios, no hay nada que lo referencie.
	public void deleteMyTweets () {
		tweets.clear();
	}
	
	public void deleteTweetsFrom (User u) {
		//Borrar ReTweets de Este Usuario coincidentes con tweets del usuario que se va a borrar
		tweets.removeIf(tw -> tw.relacionadoConUsuario(u));
	}
	
	public List<Publicacion> getTweets() {
		return tweets;
	}
	
}
