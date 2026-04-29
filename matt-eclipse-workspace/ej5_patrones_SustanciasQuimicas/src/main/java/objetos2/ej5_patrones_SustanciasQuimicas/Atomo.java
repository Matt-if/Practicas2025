package objetos2.ej5_patrones_SustanciasQuimicas;

public class Atomo extends ElementoQuimico {
	private String simbolo;
	private Integer pesoMolecular;
	private Integer carga;
	private Boolean metal;
	
	public Atomo(String simbolo, Integer pesoMolecular, Integer carga, Boolean metal) {
		this.simbolo = simbolo;
		this.pesoMolecular = pesoMolecular;
		this.carga = carga;
		this.metal = metal;
	}

	public String formula() {
		return this.simbolo;
	}

	public Integer pesoMolecular() {
		return this.pesoMolecular;
	}

	public Integer carga() {
		return this.carga;
	}
	
	public boolean soyMetal () {
		return this.metal;
	}
	
}
