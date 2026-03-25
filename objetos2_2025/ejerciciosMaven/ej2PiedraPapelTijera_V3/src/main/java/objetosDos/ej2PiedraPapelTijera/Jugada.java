package objetosDos.ej2PiedraPapelTijera;

public abstract class Jugada {
	
	//lo unico interesante fue conocer el double dispatching
	// A mi no me copa mucho esta solucion, pero esta entra las correctas.
	public abstract String jugarContra(Jugada otra);
	
	public abstract String contraPiedra();
	public abstract String contraPapel();
	public abstract String contraTijera();
	public abstract String contraLagarto();
	public abstract String contraSpock();

}
