package objetos2.ej6_patrones_SubteWay;

public class DirectorSandwich {

	SandwichBuilder SandwichAElaborar;

	public DirectorSandwich(SandwichBuilder sandwichAElaborar) {
		SandwichAElaborar = sandwichAElaborar;
	}

	public Sandwich construirSandwich () {
		
		Sandwich s = new Sandwich();
		SandwichAElaborar.agregarPan(s);
		SandwichAElaborar.agregarPrincipal(s);
		SandwichAElaborar.agregarAderezo(s);
		SandwichAElaborar.agregarAdicional(s);
		
		return s;
		
	}
}
