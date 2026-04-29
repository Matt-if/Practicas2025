package objetos2.ej5_patrones_SustanciasQuimicas;

public abstract class ElementoQuimico {

	public abstract String formula();

	public abstract Integer pesoMolecular();

	public abstract Integer carga();

	public abstract boolean soyMetal();
	
	public boolean esValida(ElementoQuimico e) {
		return true;
	}
	
	public boolean agregarElementoQuimico(ElementoQuimico elem) {
		return false;
	}
	
}
