package objetos2.ej6_patrones_SubteWay;

public class SandwichVegano implements SandwichBuilder {

	@Override
	public void agregarPan(Sandwich s) {
		s.agregarIngrediente("Pan Integral", 100);
		
	}

	@Override
	public void agregarAderezo(Sandwich s) {
		s.agregarIngrediente("Salsa Criolla", 20);
		
	}

	@Override
	public void agregarPrincipal(Sandwich s) {
		s.agregarIngrediente("Milanesa Girgolas", 500);
		
	}

	@Override
	public void agregarAdicional(Sandwich s) {

	}

}
