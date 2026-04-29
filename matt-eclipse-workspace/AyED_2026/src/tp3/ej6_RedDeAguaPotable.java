package tp3;

import java.util.Iterator;

public class ej6_RedDeAguaPotable {

	private GeneralTree<String> arbol = aGeneralesEjemplo.aGeneralStrings_1();
	/*
	 * 
	 * Mantener el minimo con el retorno del metodo.
	 * Pasar el caudal a los hijos por parametro (caudal recibido / cant de hijos)
	 * 
	 * Solamente las hojas van a retornar un caudal posible
	 */
	
	private double recorrido(GeneralTree<String> ab, double caudal, double caudalMinimo) {
		
		if (ab.isLeaf() && caudal < caudalMinimo) {
			caudalMinimo = caudal;
		}
		else {
			Iterator<GeneralTree<String>> it = ab.getChildren().iterator();
			
			while (it.hasNext()) {
				caudalMinimo = this.recorrido(it.next(), caudal / ab.getChildren().size(), caudalMinimo);
			}
		}
		
		return caudalMinimo;
	}
	
	public double minimoCaudal(double caudal) {
		
		if (arbol != null && !arbol.isEmpty())	
			return recorrido(arbol, caudal, caudal);
		else return -1;
	}
	
	public static void main (String [] args) {
		ej6_RedDeAguaPotable test = new ej6_RedDeAguaPotable();
		
		System.out.println(test.minimoCaudal(1000));
	}
}
