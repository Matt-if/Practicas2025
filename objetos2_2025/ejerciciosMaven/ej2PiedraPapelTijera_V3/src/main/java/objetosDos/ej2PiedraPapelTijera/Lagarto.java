package objetosDos.ej2PiedraPapelTijera;

public class Lagarto extends Jugada {
	
	public String jugarContra(Jugada otra) {
		return otra.contraLagarto();
	}
	
	public String contraPiedra() {
		return "Gana Piedra";
	}

	public String contraPapel() {
		return "Gana lagarto";
	}
	
	public String contraTijera() {
		return "Gana Tijera";
	}

	public String contraLagarto() {
		return "Empate";
	}
	
	public String contraSpock() {
		return "Gana lagarto";
	}

}
