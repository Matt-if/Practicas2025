package tp2;

import tp1.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	public BinaryTree(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	/**
	 * Preguntar antes de invocar si hasLeftChild()
	 * @return
	 */
	public BinaryTree<T> getLeftChild() {
		return leftChild;
	}
	/**
	 * Preguntar antes de invocar si hasRightChild()
	 * @return
	 */
	public BinaryTree<T> getRightChild() {
		return this.rightChild;
	}

	public void addLeftChild(BinaryTree<T> child) {
		this.leftChild = child;
	}

	public void addRightChild(BinaryTree<T> child) {
		this.rightChild = child;
	}

	public void removeLeftChild() {
		this.leftChild = null;
	}

	public void removeRightChild() {
		this.rightChild = null;
	}

	public boolean isEmpty(){
		return (this.isLeaf() && this.getData() == null);
	}

	public boolean isLeaf() {
		return (!this.hasLeftChild() && !this.hasRightChild());

	}
		
	public boolean hasLeftChild() {
		return this.leftChild!=null;
	}

	public boolean hasRightChild() {
		return this.rightChild!=null;
	}
	@Override
	public String toString() {
		return this.getData().toString();
	}
	
	
	// ============ Impresion de Recorridos ============
	
	public void printPreorden() {
		System.out.println(this.getData());
		
		if (this.hasLeftChild()) {
			this.getLeftChild().printPreorden();
		}
		if (this.hasRightChild()) {
			this.getRightChild().printPreorden();
		}
	}
	
	public void printPostorden() {
		
		if (this.hasLeftChild()) {
			this.getLeftChild().printPostorden();
		}
		
		if (this.hasRightChild()) {
			this.getRightChild().printPostorden();
		}
		
		System.out.println(this.getData());
	}
	
	public void printInorden() {
		
		if (this.hasLeftChild()) {
			this.getLeftChild().printInorden();
		}
		
		System.out.println(this.getData());
		
		if (this.hasRightChild()) {
			this.getRightChild().printInorden();
		}
	}
	
	public void printPorNiveles () {
		BinaryTree<T> ab = null;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		cola.enqueue(this);
		cola.enqueue(null);
		
		while (!cola.isEmpty()) {
			ab = cola.dequeue();
			if (ab != null) {
				System.out.print(ab.getData() + " ");
				if (ab.hasLeftChild()) {
					cola.enqueue(ab.getLeftChild());
				}
				if (ab.hasRightChild()) {
					cola.enqueue(ab.getRightChild());
				}
			}
			else if (!cola.isEmpty()) {
				System.out.println();
				cola.enqueue(null);
			}
		}
	}
	
	
	// ============ Ejercicio 2 ============ 
	
	//recorrido en profundidad, si llego y es hoja, sumo 1.
	// Caso base es Hoja
	// Caso recursivo nodo intermedio
		
	public int contarHojas() {
		
		int i=0, d=0;
		
		if (this.isLeaf()) return 1;
		
		else {
			
			if (this.hasLeftChild()) {
				i = this.getLeftChild().contarHojas();
			}
			
			if (this.hasRightChild()) {
				d = this.getRightChild().contarHojas();
			}
			
			return i + d;	
		}
	}
	
	// Caso Base es hoja --> no hago nada
	// Caso recursivo: tiene hijos --> se invierten en el nuevo arbol.
	public BinaryTree<T> espejo(){
		BinaryTree<T> ab = new BinaryTree<T>(this.data);
		
		this.espejoRecursivo(ab);
		
		return ab;
    }
	
	private void espejoRecursivo(BinaryTree<T> ab) {
			
		if (this.hasLeftChild()) {
			BinaryTree<T> nodo = new BinaryTree<T>(this.getLeftChild().getData());
			ab.addRightChild(nodo);
			
			this.getLeftChild().espejoRecursivo(ab.getRightChild());
		}
		
		if (this.hasRightChild()) {
			BinaryTree<T> nodo = new BinaryTree<T>(this.getRightChild().getData());
			ab.addLeftChild(nodo);
			
			this.getRightChild().espejoRecursivo(ab.getLeftChild());
		}
	}
	


	// Imprime el recorrido por niveles de los elementos del árbol receptor entre los niveles n y m (ambos inclusive).
	// 0≤n<m≤altura del árbol)
	public void printEntreNiveles(int n, int m){
		BinaryTree<T> temp;
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		int nivelActual = 0;
		
		cola.enqueue(this);
		cola.enqueue(null);
		
		while (!cola.isEmpty() & nivelActual <= m) {
			temp = cola.dequeue();
			if (temp != null) {
				if (nivelActual >= n) System.out.print(temp.getData() + " ");
				
				if (temp.hasLeftChild()) cola.enqueue(temp.getLeftChild());
				
				if (temp.hasRightChild()) cola.enqueue(temp.getRightChild());
			}
			else if (!cola.isEmpty()) {
				cola.enqueue(null);
				nivelActual++;
				System.out.println("");
			}
		}
   }
		
}

