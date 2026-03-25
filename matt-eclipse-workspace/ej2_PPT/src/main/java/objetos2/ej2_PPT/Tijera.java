package objetos2.ej2_PPT;

public class Tijera extends Jugada{

	public String jugarContra (Jugada j) {
		return j.jugarVsTijera();
	}
	
	public String jugarVsPapel () {
		return "Gana Tijera";
	}
	public String jugarVsPiedra () {
		return "Gana Piedra";
	}
	
	public String jugarVsTijera () {
		return "Empate";
	}
}
