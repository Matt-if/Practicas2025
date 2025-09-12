package tp3;

import tp1.Queue;

public class ej4AnalizadorArbol {
	/*
	 * Lo mas conveniente es un recorrido por niveles, obteniendo cada promedio y conservando el maximo.
	 */
	
	public double devolverMaximoPromedio (GeneralTree<AreaEmpresa> arbol) {
		double promedioActual = 0, promedioMaximo = 0;
		int cantNodosDelNivel = 0, suma = 0;
		
		GeneralTree<AreaEmpresa> arbol_aux;
		
		Queue<GeneralTree<AreaEmpresa>> cola = new Queue<GeneralTree<AreaEmpresa>>();
		
		if (arbol != null && !arbol.isEmpty()) {
			
			cola.enqueue(arbol);
			cola.enqueue(null);
			
			while (!cola.isEmpty()) {
				arbol_aux = cola.dequeue();
				
				if (arbol_aux != null) {
					suma += arbol_aux.getData().getTardanzaTransmision();
					cantNodosDelNivel++;
					
					for (GeneralTree<AreaEmpresa> child : arbol_aux.getChildren()) {
						cola.enqueue(child);
					}
				}
				else if (!cola.isEmpty()) {
					cola.enqueue(null);
					promedioActual = suma / cantNodosDelNivel;
					
					if (promedioActual > promedioMaximo) 
						promedioMaximo = promedioActual;
					
					suma = 0;
					cantNodosDelNivel = 0;
					
				}
			}
		}
		return promedioMaximo;
	}
	
	public static void main(String [] args) {
		
		ej4AnalizadorArbol analisis = new ej4AnalizadorArbol();
		GeneralTree<AreaEmpresa> ab = new GeneralTree<AreaEmpresa>();
		
		System.out.println(analisis.devolverMaximoPromedio(ab));
		
	}
}
