package objetos2.ej2_PPT;

public class Piedra extends Jugada{

	public String jugarContra (Jugada j) {
		return j.jugarVsPiedra();
	}
	
	public String jugarVsPapel () {
		return "Gana Papel";
	}
	public String jugarVsPiedra () {
		return "Empate";
	}
	
	public String jugarVsTijera () {
		return "Gana Piedra";
	}
}
