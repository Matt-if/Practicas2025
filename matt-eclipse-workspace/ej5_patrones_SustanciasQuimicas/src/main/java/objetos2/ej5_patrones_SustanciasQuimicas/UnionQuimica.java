package objetos2.ej5_patrones_SustanciasQuimicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionQuimica extends ElementoQuimico{

	private List<ElementoQuimico> elementos;
	
	public UnionQuimica(List<ElementoQuimico> elementos) {
		
		this.elementos = new ArrayList<ElementoQuimico>(elementos);
		
	}

	public boolean soyMetal () {
		return this.elementos.stream().anyMatch(e -> e.soyMetal());
	}
	
	@Override
	public boolean esValida(ElementoQuimico elemNuevo) {
		
		return ! (this.soyMetal() && elemNuevo.soyMetal());
	}

	@Override
	public boolean agregarElementoQuimico(ElementoQuimico elem) {
		
		if (this.esValida(elem)) {
			return elementos.add(elem);
		}
		
		return false;
	}
	

	public String formula() {
		return this.elementos.stream()
                .map(ElementoQuimico::formula)
                .collect(Collectors.joining());
	}

	public Integer pesoMolecular() {
		return this.elementos.stream().mapToInt(e -> e.pesoMolecular()).sum();
	}

	@Override
	public Integer carga() {
		return this.elementos.stream().mapToInt(e -> e.carga()).sum();
	}
}
