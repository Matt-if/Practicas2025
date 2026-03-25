package objetos.dos.ej_13Patrones;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sandwich {
	private List<Elemento> elementos;

	public Sandwich() {
		super();
		elementos = new ArrayList<Elemento>();
	}
	
	public void addElemento(Elemento e) {
		elementos.add(e);
	}
	
	public double calcularPrecio () {
		return elementos.stream()
				.mapToDouble(s -> s.getPrecio())
				.sum();
	}
	
	public String obtenerIngredientes() {
		return elementos.stream()
				.map(s -> s.getNombre())
				.collect(Collectors.joining(", "));
	}
	
	@Override
	public String toString() {
		return "Precio: " + this.calcularPrecio() + "\n"
			+ "Ingredientes: " + this.obtenerIngredientes();
	}
}
