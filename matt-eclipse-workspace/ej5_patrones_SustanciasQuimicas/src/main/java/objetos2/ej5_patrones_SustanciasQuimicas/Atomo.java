package objetos2.ej5_patrones_SustanciasQuimicas;

public class Atomo extends ElementoQuimico {

	public Atomo(String simbolo, Integer pesoMolecular, Integer carga, Boolean metal) {
		this.simbolo = simbolo;
		this.pesoMolecular = pesoMolecular;
		this.carga = carga;
		this.metal = metal;
	}

	// al final, es necesario tener esta clase Atomo ? SII !!!
	// para poder usar composite...
	
}
