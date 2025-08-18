package objetosDos.ej2PiedraPapelTijera;

public class Papel extends Jugada{
	
	public String jugarContra(Jugada otra) {
		return otra.contraPapel();
	}
	
	public String contraPiedra() {
		return "Gana Papel";
	}

	public String contraPapel() {
		return "Empate";
	}
	
	public String contraTijera() {
		return "Gana Tijera";
	}

	public String contraLagarto() {
		return "Gana Lagarto";
	}
	
	public String contraSpock() {
		return "Gana Papel";
	}
}
