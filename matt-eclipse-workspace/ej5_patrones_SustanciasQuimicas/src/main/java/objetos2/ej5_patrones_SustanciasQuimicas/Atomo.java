package objetos2.ej5_patrones_SustanciasQuimicas;

public class Atomo extends ElementoQuimico {

	public Atomo(String simbolo, Integer pesoMolecular, Integer carga, Boolean metal) {
		this.simbolo = simbolo;
		this.pesoMolecular = pesoMolecular;
		this.carga = carga;
		this.metal = metal;
	}

	// al final, es necesario tener esta clase Atomo ?
	/*
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
	
	@Override
	public String toString () {
		return this.formula();
	}
	*/
	
}
