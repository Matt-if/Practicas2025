package objetosDos.ej1RedSocial;

public class ReTweet implements Publicacion {
	
	private Tweet twOrigen; 
	
	public ReTweet (Tweet t) {
		this.twOrigen = t;
	}

	public Tweet getTwOrigen() {
		return twOrigen;
	}
	
	// no tiene nombre representativo y sobreescribo algo que hace otra cosa.
	public boolean relacionadoConUsuario(User u) {
		//Tomamos lista de usuario y vemos si el tweet origen esta o no.
		return u.getTweets().stream()
		.anyMatch(tw -> tw == twOrigen);
	}
}
