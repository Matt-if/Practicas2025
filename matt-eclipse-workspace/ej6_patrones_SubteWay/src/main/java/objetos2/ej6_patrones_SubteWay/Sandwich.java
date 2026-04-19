package objetos2.ej6_patrones_SubteWay;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
	List<Ingrediente> ingredientes;
	
	public Sandwich() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}

	public double precio () {
		return this.ingredientes.stream()
				.mapToDouble(i -> i.getPrecio())
				.sum();
	}
	
	public void agregarIngrediente (String n, double p) {
		this.ingredientes.add(new Ingrediente(n, p));
	}

}
