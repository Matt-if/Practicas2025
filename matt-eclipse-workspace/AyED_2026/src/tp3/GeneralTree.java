package tp3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import tp1.ejercicio8.Queue;

public class GeneralTree<T>{

	private T data;
	private List<GeneralTree<T>> children = new LinkedList<GeneralTree<T>>(); 

	public GeneralTree() {
		
	}
	public GeneralTree(T data) {
		this.data = data;
	}

	public GeneralTree(T data, List<GeneralTree<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTree<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTree<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTree<T> child) {
		this.getChildren().add(child);
	}

	public boolean isLeaf() {
		return !this.hasChildren();
	}
	
	public boolean hasChildren() {
		return !this.children.isEmpty();
	}
	
	public boolean isEmpty() {
		return this.data == null && !this.hasChildren();
	}

	public void removeChild(GeneralTree<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	// ====================== Recorridos simples ======================
	
	public void preOrder () {
		System.out.println(this.getData());
		
		for (GeneralTree<T> child : this.getChildren()) {
			child.preOrder();
		}
	}
	
	public void postOrder () {
		
		for (GeneralTree<T> child : this.getChildren()) {
			child.postOrder();
		}
		
		System.out.println(this.getData());
	}
	

	public void inOrder () {
			
		if (this.hasChildren()) this.getChildren().get(0).inOrder();
		
		System.out.println(this.getData());
		
		for (int i=1; i < this.getChildren().size(); i++) {
			this.getChildren().get(i).inOrder();
		}
		
	}
	
	public void porNiveles() {
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		
		GeneralTree<T> arbol_aux;
		cola.enqueue(this);
		cola.enqueue(null);
		
		
		while (!cola.isEmpty()) {
			arbol_aux = cola.dequeue();
			
			if (arbol_aux != null) {
				
				System.out.print(arbol_aux.getData() + "  ");
				
				if (arbol_aux.hasChildren()) {
					for (GeneralTree<T> child: arbol_aux.getChildren()) {
						cola.enqueue(child);
					}
				}
			}
			else {
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					System.out.println();
			
				}
			}
		}
	}
	// =================================== ejercicio 5 =================================== 
	
	// devuelve true si el valor “a” es ancestro del valor “b”.
	public boolean esAncestro(T a, T b) {
		
		return false;
	}
	
	// =================================== Metodos del ejercicio 3 =================================== 

	//Hay que recorrer todo el arbol y retornar manteniendo la profundidad del nodo mas profundo encontrado.
	private int calcularAlturaDelArbol (int alturaActual) {
		int maxProfundidadDeUnHijo = alturaActual, profundidadHijo;
		
		if (this.hasChildren()) {
			alturaActual++;
			for (GeneralTree<T> child : this.getChildren()) {
				profundidadHijo = child.calcularAlturaDelArbol(alturaActual);
				
				if (profundidadHijo > maxProfundidadDeUnHijo)
					maxProfundidadDeUnHijo = profundidadHijo;
			}
		}

		return maxProfundidadDeUnHijo;
	}
	
	// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja
	// el nodo siempre retorna la altura maxima encontrada hasta el inclusive, si cambia es porque la compare con max y es mayor.
	
	public int altura_versionRancia() {	 
		
		return calcularAlturaDelArbol(0);

	}
	
	//Version razonable
	// Si es hoja: 0.
	// Si no es hoja: 1 + la altura máxima de sus hijos.
	public int altura() {
		int alturaMax = 0, alturaHijo;
		
		if (this.isLeaf()) {
	        return 0;
	    }

	    for (GeneralTree<T> child : this.getChildren()) {
	        alturaHijo = child.altura();
	        if (alturaHijo > alturaMax) {
	            alturaMax = alturaHijo;
	        }
	    }

	    return alturaMax + 1;
	}
	
	private int nivelDe(T dato, int nivelAct) {
		int nivelDeDatoBuscado = -1;
		
		if (dato.equals(this.getData()))
			nivelDeDatoBuscado = nivelAct;
		else {
			if (this.hasChildren()) {
				Iterator<GeneralTree<T>> children = this.getChildren().iterator();
				while (nivelDeDatoBuscado == -1 && children.hasNext()) {
					nivelDeDatoBuscado = children.next().nivelDe(dato, nivelAct + 1);
				}
			}
		}
		
		return nivelDeDatoBuscado;
	}
	
	// devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo es la longitud del único camino de la raíz al nodo.
	public int nivel(T dato){
		return nivelDe(dato, 0);
	  }

	// La amplitud (ancho) de un árbol se define como la cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad de nodos.
	public int ancho(){
		GeneralTree<T> ab;
		Queue<GeneralTree<T>> cola = new Queue<GeneralTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		
		int anchoMax = -1, anchoAct = 0;
		
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			
			if (ab != null) {
				anchoAct++;
				for (GeneralTree<T> child: ab.getChildren()) {
					cola.enqueue(child);
				}
			}
			
			else {
				// si esto lo dejas dentro del otro if, no se procesa el ultimo nivel !
				if (anchoAct > anchoMax) 
					anchoMax = anchoAct;
				
				if (!cola.isEmpty()) {
					cola.enqueue(null);
					anchoAct = 0;
				}
			}	
		}
		return anchoMax;
	}
}