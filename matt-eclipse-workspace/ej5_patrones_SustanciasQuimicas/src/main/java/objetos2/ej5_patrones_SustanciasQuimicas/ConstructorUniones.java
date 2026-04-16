package objetos2.ej5_patrones_SustanciasQuimicas;

public class ConstructorUniones {

	public UnionQuimica construirUnion (ElementoQuimico elem1, ElementoQuimico elem2) {
		if (elem1.soyMetal() && elem2.soyMetal()) {
			return null;
		}
		UnionQuimica union = new UnionQuimica(elem1, elem2);
		return union;
	}
}
