package objetos2.ej6_patrones_SubteWay;

public class SandwichVegetariano implements SandwichBuilder {

	@Override
	public void agregarPan(Sandwich s) {
		s.agregarIngrediente("Pan Con Semillas", 120);
		
	}

	@Override
	public void agregarAderezo(Sandwich s) {
				
	}

	@Override
	public void agregarPrincipal(Sandwich s) {
		s.agregarIngrediente("Provoleta Grillada", 200);
		
	}

	@Override
	public void agregarAdicional(Sandwich s) {
		s.agregarIngrediente("Berenjenas al escabeche", 100);
		
	}

}
