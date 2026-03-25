package tp3;

import java.util.LinkedList;
import java.util.List;

import tp1.Queue;

public class GeneralTreeViejo<T>{

	private T data;
	private List<GeneralTreeViejo<T>> children = new LinkedList<GeneralTreeViejo<T>>(); 

	public GeneralTreeViejo() {
		
	}
	
	public GeneralTreeViejo(T data) {
		this.data = data;
	}

	public GeneralTreeViejo(T data, List<GeneralTreeViejo<T>> children) {
		this(data);
		this.children = children;
	}	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<GeneralTreeViejo<T>> getChildren() {
		return this.children;
	}
	
	public void setChildren(List<GeneralTreeViejo<T>> children) {
		if (children != null)
			this.children = children;
	}
	
	public void addChild(GeneralTreeViejo<T> child) {
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

	public void removeChild(GeneralTreeViejo<T> child) {
		if (this.hasChildren())
			children.remove(child);
	}
	
	// ====================== Recorridos simples ======================
	
	public void preOrder () {
		System.out.println(this.getData());
		
		for (GeneralTreeViejo<T> child : this.getChildren()) {
			child.preOrder();
		}
	}
	
	public void postOrder () {
		
		for (GeneralTreeViejo<T> child : this.getChildren()) {
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
		Queue<GeneralTreeViejo<T>> cola = new Queue<GeneralTreeViejo<T>>();
		
		GeneralTreeViejo<T> arbol_aux;
		cola.enqueue(this);
		cola.enqueue(null);
		
		
		while (!cola.isEmpty()) {
			arbol_aux = cola.dequeue();
			
			if (arbol_aux != null) {
				
				System.out.print(arbol_aux.getData() + "  ");
				
				if (arbol_aux.hasChildren()) {
					for (GeneralTreeViejo<T> child: arbol_aux.getChildren()) {
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
	
	// ============================================ ejercicio 3 ============================================
	
	// devuelve la altura del árbol, es decir, la longitud del camino más largo desde el nodo raíz hasta una hoja.
	public int altura_VersionVieja() {
		int miAltura = 0, alturaHijo;
		
		if (this.hasChildren()) miAltura++;
		
		for (GeneralTreeViejo<T> child : this.getChildren()) {
			alturaHijo = child.altura();
			if (miAltura <= alturaHijo) miAltura = alturaHijo + 1;
		}
		
		return miAltura;
	}

	public int altura() {
		int alturaHijo, alturaMaxima = 0;
		
		for (GeneralTreeViejo<T> child : this.getChildren()) {
			alturaHijo = child.altura();
			if (alturaHijo >= alturaMaxima) alturaMaxima = alturaHijo + 1;
			
		}
		
		return alturaMaxima;
	}
	
	//recurso de nivel(T dato)
	private int buscarDato(T dato, int nivelActual) {
		int res = -1, aux = -1;
		
		if (!this.getData().equals(dato)) {
			
			nivelActual++;
			for (GeneralTreeViejo<T> child : this.getChildren()) {
				res = child.buscarDato(dato, nivelActual);
				if (res != -1) aux = res;
			}

		}
		
		else {
			return nivelActual;
		}
		
		return aux;
		
	}
	
	// devuelve la profundidad o nivel del dato en el árbol. El nivel de un nodo es la longitud del único camino de la raíz al nodo.
	public int nivel(T dato){
		if (!this.isEmpty())
			return buscarDato(dato, 0);
		return -1;
	}


	// la amplitud (ancho) de un árbol se define como la cantidad de nodos que se encuentran en el nivel que posee la mayor cantidad de nodos.
	public int ancho(){
		int amplitud = 0, amplitudNivelActual = 0;
		Queue<GeneralTreeViejo<T>> cola = new Queue<GeneralTreeViejo<T>>();
		GeneralTreeViejo<T> arbol_aux;
		
		if (!this.isEmpty()) {
			cola.enqueue(this);
			cola.enqueue(null);
			
			while (!cola.isEmpty()) {
				arbol_aux = cola.dequeue();
				
				if (arbol_aux != null) {
					amplitudNivelActual++;
					
					if (arbol_aux.hasChildren()) {
						for (GeneralTreeViejo<T> child: arbol_aux.getChildren()) {
							cola.enqueue(child);
						}
					}
				}
				else {
					if (!cola.isEmpty()) {
						cola.enqueue(null);
						if (amplitudNivelActual > amplitud) 
							amplitud = amplitudNivelActual;
						amplitudNivelActual = 0;
				
					}
				}
			}
		}
		
		return amplitud;
	}
	
	// ============================================ ejercicio 5 ============================================
	private GeneralTreeViejo<T> buscarNodo(GeneralTreeViejo<T> ab, T b) {
		
		GeneralTreeViejo<T> busqueda = null, aux = null;
		
		if (ab.getData() != b) {

			for (GeneralTreeViejo<T> child: ab.getChildren()) {
				busqueda = child.buscarNodo(child, b);
				if (busqueda != null) aux = busqueda;
			}
		}
		else 
			return ab;
		
		return aux;
	}
	
	
	//Se dice que un nodo n es ancestro de un nodo m si existe un camino desde n a m. 
	//Este metodo devuelve true si el valor “a” es ancestro del valor “b”. 
	public boolean esAncestro(T a, T b) {
		GeneralTreeViejo<T> ancestro = null, sucesor = null;
				
		if (!this.isEmpty()) {
			ancestro = this.buscarNodo(this, a); //empezamos buscando al potencial ancestro desde la raiz.
			
			if (ancestro != null && !ancestro.isLeaf())
				sucesor = this.buscarNodo(ancestro, b); //buscamos al sucesor desde el nodo que deberia ser su ancestro
			
			if (sucesor != null) 
				return true;
		}

		return false;
	}
	
}
