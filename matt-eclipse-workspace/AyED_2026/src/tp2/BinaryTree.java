package tp2;

import tp1.ejercicio8.Queue;

public class BinaryTree <T> {
	
	private T data;
	private BinaryTree<T> leftChild;   
	private BinaryTree<T> rightChild; 

	
	public BinaryTree() {
		super();
	}

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

	// ============ ejercicios de la practica ============
	
	public int contarHojas() {
	   int suma = 0;
		if (this.isLeaf())
			suma = 1;
		else {
			if (this.hasLeftChild())
				suma += this.getLeftChild().contarHojas();
			if (this.hasRightChild())
				suma += this.getRightChild().contarHojas();
		}
		return suma;
	}
		
    private void recorridoParaEspejar (BinaryTree<T> nuevo) {
    	
    	if (this.hasLeftChild()) {
    		BinaryTree<T> nuevoDerecho = new BinaryTree<T>(this.getLeftChild().getData());
    		nuevo.addRightChild(nuevoDerecho);
    		this.getLeftChild().recorridoParaEspejar(nuevoDerecho);
    	}
    	
    	if (this.hasRightChild()) {
    		BinaryTree<T> nuevoIzquierdo = new BinaryTree<T>(this.getRightChild().getData());
    		nuevo.addLeftChild(nuevoIzquierdo);
    		this.getRightChild().recorridoParaEspejar(nuevoIzquierdo);
    	}
    	
    }
    
    public BinaryTree<T> espejo(){
    	BinaryTree<T> arbolEspejo = new BinaryTree<T>(this.getData());
    	
    	recorridoParaEspejar(arbolEspejo);
    	
 	   return arbolEspejo;
    }

	// 0<=n<=m
	public void entreNiveles(int n, int m){
		Queue<BinaryTree<T>> cola = new Queue<BinaryTree<T>>();
		BinaryTree<T> ab = null;
		cola.enqueue(this);
		cola.enqueue(null);
		int nivelActual = 0;
				
		while (!cola.isEmpty() && nivelActual <= m) {
			ab = cola.dequeue();
			if (ab != null) {
				if (nivelActual >= n)
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
				nivelActual++;
				cola.enqueue(null);
			}
		}
		
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
		
		System.out.print(this.getData() + " - ");
		
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
		
}
