package objetosDos.ej2PiedraPapelTijera;

public class Spock extends Jugada {
	
	public String jugarContra(Jugada otra) {
		return otra.contraSpock();
	}
	
	public String contraPiedra() {
		return "Gana Spock";
	}

	public String contraPapel() {
		return "Gana Papel";
	}
	
	public String contraTijera() {
		return "Gana Spock";
	}

	public String contraLagarto() {
		return "Gana Lagarto";
	}
	
	public String contraSpock() {
		return "Empate";
	}

}
