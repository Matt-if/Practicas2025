package objetosDos.ej2PiedraPapelTijera;

public class Tijera extends Jugada {
	
	public String jugarContra(Jugada otra) {
		return otra.contraTijera();
	}
	
	public String contraPiedra() {
		return "Gana Piedra";
	}

	public String contraPapel() {
		return "Gana Papel";
	}
	
	public String contraTijera() {
		return "Empate";
	}

	public String contraLagarto() {
		return "Gana Lagarto";
	}
	
	public String contraSpock() {
		return "Gana Spock";
	}
}
