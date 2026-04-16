package objetos2.ej5_patrones_SustanciasQuimicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionQuimica extends ElementoQuimico{

	private List<ElementoQuimico> elementos;
	
	public UnionQuimica(ElementoQuimico elem1, ElementoQuimico elem2) {
		
		this.metal = elem1.metal || elem2.metal;
		
		this.carga = elem1.carga + elem2.carga;
		this.pesoMolecular = elem1.pesoMolecular + elem2.pesoMolecular; 
		this.simbolo = elem1.simbolo + elem2.simbolo;
		
		elementos = new ArrayList<ElementoQuimico>(List.of(elem1, elem2));
		
	}
	
	@Override
	public boolean esValida(ElementoQuimico elemNuevo) {
		
		return ! (this.soyMetal() && elemNuevo.soyMetal());
	}

	@Override
	public boolean agregarElementoQuimico(ElementoQuimico elem) {

		
		if (this.esValida(elem)) {
			this.pesoMolecular += elem.pesoMolecular;
			this.carga += elem.carga;
			this.simbolo += elem.simbolo;
			return elementos.add(elem);
		}
		
		return false;
	}
	
	@Override
	public String formula() {
		return this.elementos.stream()
                .map(ElementoQuimico::formula)
                .collect(Collectors.joining());
	}
}
