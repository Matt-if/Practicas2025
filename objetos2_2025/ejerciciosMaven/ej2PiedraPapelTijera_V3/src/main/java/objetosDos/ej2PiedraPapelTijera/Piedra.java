package objetosDos.ej2PiedraPapelTijera;

public class Piedra extends Jugada {
	
	public String jugarContra(Jugada otra) {
		return otra.contraPiedra();
	}
	
	public String contraPiedra() {
		return "Empate";
	}

	public String contraPapel() {
		return "Gana Papel";
	}
	
	public String contraTijera() {
		return "Gana Piedra";
	}

	public String contraLagarto() {
		return "Gana Piedra";
	}
	
	public String contraSpock() {
		return "Gana Spock";
	}
		
}
