package objetos2.ej5_patrones_SustanciasQuimicas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UnionQuimica extends ElementoQuimico{

	private List<ElementoQuimico> elementos;
	
	public UnionQuimica(ElementoQuimico elem1, ElementoQuimico elem2) {
		
		// ??? Es lo minimo que se me ocurre.
		this.metal = elem1.metal && elem2.metal;
		
		this.carga = elem1.carga + elem2.carga;
		this.pesoMolecular = elem1.pesoMolecular + elem2.pesoMolecular; 
		this.simbolo = elem1.simbolo + elem2.simbolo;
		
		elementos = new ArrayList<ElementoQuimico>(List.of(elem1, elem2));
		
	}
	
	// ??? Lo unico que se me ocurrio es ver si hay al menos un elemento que no es metal y ya seria valida...
	@Override
	public boolean esValida() {
		return elementos.stream()
				.anyMatch(e -> !e.soyMetal());
	}

	@Override
	public boolean agregarElementoQuimico(ElementoQuimico elem) {
		this.pesoMolecular += elem.pesoMolecular;
		this.carga += elem.carga;
		this.simbolo += elem.simbolo;
		
		// ???
		this.metal = this.soyMetal() && elem.soyMetal();
		
		return elementos.add(elem);
	}
	
	@Override
	public String formula() {
		return this.elementos.stream()
                .map(ElementoQuimico::formula)
                .collect(Collectors.joining());
	}

	/* INNECESARIO porque el peso ya esta calculado en la variable...
	 * 
	public Integer pesoMolecular() {
		return elementos.stream()
				.mapToInt(elem -> elem.pesoMolecular())
				.sum();
	}

	// Idem pesoMolecular...
	public Integer carga() {
		return elementos.stream()
				.mapToInt(elem -> elem.carga())
				.sum();
	}
	*/
}
