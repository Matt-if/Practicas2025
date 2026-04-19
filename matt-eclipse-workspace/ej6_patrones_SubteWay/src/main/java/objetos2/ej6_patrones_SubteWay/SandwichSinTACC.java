package objetos2.ej6_patrones_SubteWay;

public class SandwichSinTACC implements SandwichBuilder {

	@Override
	public void agregarPan(Sandwich s) {
		s.agregarIngrediente("Chipa", 150);
		
	}

	@Override
	public void agregarAderezo(Sandwich s) {
		s.agregarIngrediente("Salsa tartara", 18);
		
	}

	@Override
	public void agregarPrincipal(Sandwich s) {
		s.agregarIngrediente("Pollo", 250);
		
	}

	@Override
	public void agregarAdicional(Sandwich s) {
		s.agregarIngrediente("Verduras Grilladas", 200);
		
	}

}
