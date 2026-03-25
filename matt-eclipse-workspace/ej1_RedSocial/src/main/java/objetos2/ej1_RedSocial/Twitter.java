package objetos2.ej1_RedSocial;

import java.util.ArrayList;

public class Twitter {
	
	private ArrayList<User> users;
	
	public Twitter() {
		users = new ArrayList<User>();
	}
	
	private boolean userExists (String screenName) {
		return users.stream()
				.anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	public User createUser(String screenName) {
		if (this.userExists(screenName)) return null;
		User u = new User(screenName);
		this.users.add(u);
		return u;
	}
	
	
	/* En el enunciado dice:
	"Los tweets de un usuario se deben eliminar cuando el usuario es eliminado. No existen tweets no referenciados por un usuario."
	Pero no dice "No existen Re-tweets...", osea yo puedo tener re-tweets que hagan referencia a un Tweet que fue eliminado,
	algo que pasa en la realidad.
	Los tweets son instancias de objetos, entonces la eliminacion literal depende del GC cuando no existan referencias al tweet.
	Si los retweets siguen referenciando, no se van a borrar, entonces:
	 1) eliminas cualquier referencia hacia un tweet del usuario que se va a elimnar
	 2) (no aplicable) eliminarias el tweet fisicamente porque es un archivo almacenado en una BD.
	*/
	
	private void deleteTweetsReferencesFrom(User u) {
		this.users.stream().forEach(user -> user.deleteMyRetweetsOriginatedFrom(u));
			
	}
	
	public boolean deleteUser(User u) {
		
		this.deleteTweetsReferencesFrom(u);
		u.deleteMyTweets(); // innecesario porque ya se borraron todas las referencias a sus tweets.Entonces cuando borras al usuario ya perdes las unicas referencias que quedaban. 
		return users.remove(u);
	}
}
