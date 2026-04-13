package objetos2.ej5_patrones_SustanciasQuimicas;

public abstract class ElementoQuimico {

	protected String simbolo;
	protected Integer pesoMolecular;
	protected Integer carga;
	protected Boolean metal;
	
	/*
	public abstract String formula();
	public abstract Integer pesoMolecular();
	public abstract Integer carga();
	public abstract boolean esValida();
	*/
	
	public String formula() {
		return this.simbolo;
	}

	public Integer pesoMolecular() {
		return this.pesoMolecular;
	}

	public Integer carga() {
		return this.carga;
	}

	public boolean esValida() {
		return true;
	}

	public boolean soyMetal () {
		return this.metal;
	}
	
	public boolean agregarElementoQuimico(ElementoQuimico elem) {
		return false;
	}
	
}
