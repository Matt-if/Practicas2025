package tp3;

public class ej6RedDeAguaPotable {

	GeneralTree<Integer> cañerias;
	
	public ej6RedDeAguaPotable(GeneralTree<Integer> cañerias) {
		super();
		this.cañerias = cañerias;
	}

	private double recorrido(double caudal, GeneralTree<Integer> ab) {
		double minimo = 999999, valor = -1;
		
		if (ab.isLeaf()) return caudal;
		
		for (GeneralTree<Integer> child : ab.getChildren()) {
			valor = this.recorrido((caudal / ab.getChildren().size()), child);
			if (valor < minimo) minimo = valor;
		}
		
		return minimo;
	}
	
	public double minimoCaudal(double caudal) {
		
		return recorrido(caudal, this.cañerias);	
	}
	
	public static void main (String [] args) {
		//No importa que el arbol sea de caracteres realmente para hacer el ejercicio.
		GeneralTree<Integer> ab = aGeneralesEjemplo.aGeneralIntegers_2();
		ab.preOrder();
		
		ej6RedDeAguaPotable red = new ej6RedDeAguaPotable(ab);
		
		System.out.println(red.minimoCaudal(1000));
		
	}
}
