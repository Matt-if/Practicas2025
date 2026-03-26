package objetos2.ej1_RedSocial;

import java.util.ArrayList;

public class User {

	private String screenName;
	private ArrayList<Tweet> tweets;
	
	
	public User (String screenName) {
		this.screenName = screenName;
		tweets = new ArrayList<Tweet>();
	}
	
	public boolean tweet(String content) throws Exception {
		return tweets.add(new Tweet(content, this));
	}
	
	public boolean reTweet(Tweet oldTweet) {
		return tweets.add(oldTweet);
	}
	
	//recibir por parametro a User para elminar... ?
	public boolean delete() {
		
		return true;
	}
	
	public void deleteMyTweets() {
		this.tweets.clear();
	}
	
	//No supe como hacerlo con streams
	//Hay envidia de atts, corregir si la idea es por aca.
	public void deleteRetweetsOriginatedFromMe() {
		
	}

	public String getScreenName() {
		return screenName;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}	
}
