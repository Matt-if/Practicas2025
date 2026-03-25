package objetos2.ej2_PPT;

public abstract class Jugada {

	public abstract String jugarContra (Jugada j);
	
	protected abstract String jugarVsPapel ();
	protected abstract String jugarVsPiedra ();
	protected abstract String jugarVsTijera ();
}
