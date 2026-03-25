package objetos2.ej2_PPT;

public class Papel extends Jugada{

	public String jugarContra (Jugada j) {
		return j.jugarVsPapel();
	}
	
	public String jugarVsPapel () {
		return "Empate";
	}
	public String jugarVsPiedra () {
		return "Gana Papel";
	}
	
	public String jugarVsTijera () {
		return "Gana Tijera";
	}
}
