package objetos.dos.ej_11Patrones;

import java.util.LinkedList;
import java.util.List;

public class Mixta implements Topografia {
	
	List<Topografia> topografias; //maximo 4
	
	public Mixta(Topografia h1, Topografia h2, Topografia h3, Topografia h4) {
		super();
		topografias = new LinkedList<Topografia>();
		topografias.add(h1); topografias.add(h2);
		topografias.add(h3); topografias.add(h4);
	}

	@Override
	public double calcularProporcionDeAgua() {
		return topografias.stream()
				.mapToDouble(t -> t.calcularProporcionDeAgua())
				.average()
				.orElse(0);
	}

	@Override
	public double calcularProporcionDeTierra() {
		return topografias.stream()
				.mapToDouble(t -> t.calcularProporcionDeTierra())
				.average()
				.orElse(0);
	}

	@Override
	public boolean esIgual(Topografia t) {
		// TODO Auto-generated method stub
		return t.soyIgualAMixta(this);
	}
	
	@Override
	public boolean soyIgualAAgua() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualATierra() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualAPantano() {
		// TODO Auto-generated method stub
		return false;
	}

	// ================== Aca se requiere cierta logica =====================
	
	//Pista: notar que la definición de igualdad para topografías mixtas corresponde exactamente a la misma que implementan las listas en Java. 
	public boolean soyIgualAMixta(Mixta m) {
		
		return this.topografias.equals(m.getTopografias());
	}
	
	public List<Topografia> getTopografias() {
		return this.topografias;
	}

}
