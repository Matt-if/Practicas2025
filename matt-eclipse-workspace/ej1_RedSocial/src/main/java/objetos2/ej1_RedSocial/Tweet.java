package objetos2.ej1_RedSocial;

public class Tweet {
	private String content;
	private User creator;
	private Tweet origin;
	
	public Tweet (String content, User creator) throws Exception {
		if (content.length() >= 1 & content.length() <= 280) 
			this.content = content;
		else throw new IllegalArgumentException("Length must be between 1 and 280 characters");
		this.creator = creator;
		this.origin = null;
	}
	
	public Tweet (Tweet oldTweet) {
		this.origin = oldTweet;
	}
	
	public Tweet getOrigin() {
		return origin;
	}
	
}
