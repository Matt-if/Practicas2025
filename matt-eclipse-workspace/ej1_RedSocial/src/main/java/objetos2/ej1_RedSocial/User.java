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
		return tweets.add(new Tweet(content));
	}
	
	public boolean reTweet(Tweet oldTweet) {
		return tweets.add(oldTweet);
	}
	
	// tweets.clear() solo borraria las referencias en la lista del usuario pero los tweets seguirian existiendo.
	// y podrian seguir siendo referenciados por 1+ retweets (tweets con origin != null).
	public void deleteMyTweets() {
		this.tweets.clear();
	}
	
	//No supe como hacerlo con streams
	//Hay envidia de atts, corregir si la idea es por aca.
	public void deleteMyRetweetsOriginatedFrom(User u) {
		for (Tweet t: tweets) {
			if (u.getTweets().contains(t.getOrigin())) { 
				this.tweets.remove(t);
			}
		}
	}

	public String getScreenName() {
		return screenName;
	}

	public ArrayList<Tweet> getTweets() {
		return tweets;
	}	
}
