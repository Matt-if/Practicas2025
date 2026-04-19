package objetos2.ej6_patrones_SubteWay;

public class SandwichClasico implements SandwichBuilder {

	@Override
	public void agregarPan(Sandwich s) {
		s.agregarIngrediente("Pan Brioche", 100);
		
	}

	@Override
	public void agregarAderezo(Sandwich s) {
		s.agregarIngrediente("Mayonesa", 20);
		
	}

	@Override
	public void agregarPrincipal(Sandwich s) {
		s.agregarIngrediente("Carne Ternera", 300);
		
	}

	@Override
	public void agregarAdicional(Sandwich s) {
		s.agregarIngrediente("Tomate", 80);
		
	}
	

}
