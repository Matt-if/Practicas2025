package objetosDos.ej1RedSocial;

public class Tweet implements Publicacion{
	private String body;
	
	public Tweet (String body) {
		this.body = body;
	}
	
	public String getBody() {
		return body;
	}
	
	public boolean relacionadoConUsuario(User u) {
		return false;
	}

	
	public boolean isBodyLengthOk () {
		return (body.length() >= 1 && body.length() <= 280);
	}

}
