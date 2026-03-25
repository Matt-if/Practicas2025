package tp2;

public class arbolesEjemplo {
	
	public static BinaryTreeViejo <Integer> arbol_Integers_A() {
		BinaryTreeViejo<Integer> ab = new BinaryTreeViejo<Integer>(40);
		BinaryTreeViejo<Integer> hijoIzquierdo = new BinaryTreeViejo<Integer>(25);
		
		BinaryTreeViejo<Integer> hijoIzquierdoDe25 = new BinaryTreeViejo<Integer>(10);
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		
		hijoIzquierdo.addRightChild(new BinaryTreeViejo<Integer>(32));
		BinaryTreeViejo<Integer> hijoDerecho= new BinaryTreeViejo<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		return ab;
	}
	
	public static BinaryTreeViejo <Integer> arbol_Integers_B() {
		BinaryTreeViejo<Integer> ab = new BinaryTreeViejo<Integer>(40);
		BinaryTreeViejo<Integer> hijoIzquierdo = new BinaryTreeViejo<Integer>(25);
		
		BinaryTreeViejo<Integer> hijoIzquierdoDe25 = new BinaryTreeViejo<Integer>(10);
		BinaryTreeViejo<Integer> hijoIzquierdoDe10 = new BinaryTreeViejo<Integer>(1);
		hijoIzquierdoDe25.addLeftChild(hijoIzquierdoDe10);  //unica diferencia con arbol_Integers_A
		
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		
		hijoIzquierdo.addRightChild(new BinaryTreeViejo<Integer>(32));
		BinaryTreeViejo<Integer> hijoDerecho= new BinaryTreeViejo<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		//hijoDerecho.addRightChild(new BinaryTree<Integer>(1)); 
		
		
		return ab;
	}
	
	public static BinaryTreeViejo <Integer> arbol_Integers_C() {
		BinaryTreeViejo<Integer> ab = new BinaryTreeViejo<Integer>(40);
		BinaryTreeViejo<Integer> hijoIzquierdo = new BinaryTreeViejo<Integer>(25);
		
		BinaryTreeViejo<Integer> hijoIzquierdoDe25 = new BinaryTreeViejo<Integer>(10);
		BinaryTreeViejo<Integer> hijoIzquierdoDe10 = new BinaryTreeViejo<Integer>(1);
		hijoIzquierdoDe25.addLeftChild(hijoIzquierdoDe10); 
		hijoIzquierdoDe10.addRightChild(new BinaryTreeViejo<Integer>(2)); //unica diferencia con arbol_Integers_B
		
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		hijoIzquierdo.addRightChild(new BinaryTreeViejo<Integer>(32));
		
		BinaryTreeViejo<Integer> hijoDerecho= new BinaryTreeViejo<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		//hijoDerecho.addRightChild(new BinaryTree<Integer>(1)); 
		
		
		return ab;
	}
	
	//Para testear ejercicio 9
	/*
	  			20
	 		5		30
	  -5 				-9
	 */
	public static BinaryTreeViejo <Integer> arbol_Simple() {
		BinaryTreeViejo<Integer> ab = new BinaryTreeViejo<Integer>(20);
		BinaryTreeViejo<Integer> hijoIzquierdo = new BinaryTreeViejo<Integer>(5);
		BinaryTreeViejo<Integer> hijoDerecho = new BinaryTreeViejo<Integer>(30);
		
		BinaryTreeViejo<Integer> hijoIzquierdoDe5 = new BinaryTreeViejo<Integer>(-5);
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe5);
		
		BinaryTreeViejo<Integer> hijoDerechoDe30 = new BinaryTreeViejo<Integer>(-9);
		hijoDerecho.addRightChild(hijoDerechoDe30);
			
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		return ab;
	}
}
