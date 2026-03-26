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
	
	
	// Delegar a User:
	// - el borrado de sus tweets y retweets que hizo de otros
	// - Borrar tweets que le pertenecen a otros usuarios 
	
	public boolean deleteUser(User u) {
		
		u.deleteRetweetsOriginatedFromMe();
		u.deleteMyTweets(); // innecesario porque ya se borraron todas las referencias a sus tweets.Entonces cuando borras al usuario ya perdes las unicas referencias que quedaban. 
		return users.remove(u);
	}
}
