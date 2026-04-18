package tp2;

public class arbolesEjemplo {
	
	/*
	 *			   40
	 *		25			78
	 * 10		32
	 */
	public static BinaryTree <Integer> arbol_Integers_A() {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		BinaryTree<Integer> hijoIzquierdoDe25 = new BinaryTree<Integer>(10);
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		return ab;
	}
	
	/*
		 		   40
		 	25			78
		 10		32
	  1
	*/
	public static BinaryTree <Integer> arbol_Integers_B() {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		BinaryTree<Integer> hijoIzquierdoDe25 = new BinaryTree<Integer>(10);
		BinaryTree<Integer> hijoIzquierdoDe10 = new BinaryTree<Integer>(1);
		hijoIzquierdoDe25.addLeftChild(hijoIzquierdoDe10);  //unica diferencia con arbol_Integers_A
		
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		//hijoDerecho.addRightChild(new BinaryTree<Integer>(1)); 
		
		
		return ab;
	}
	

	/*
				   			40
				  25					78
			10			32
		1		2
	*/
	public static BinaryTree <Integer> arbol_Integers_C() {
		BinaryTree<Integer> ab = new BinaryTree<Integer>(40);
		BinaryTree<Integer> hijoIzquierdo = new BinaryTree<Integer>(25);
		
		BinaryTree<Integer> hijoIzquierdoDe25 = new BinaryTree<Integer>(10);
		BinaryTree<Integer> hijoIzquierdoDe10 = new BinaryTree<Integer>(1);
		hijoIzquierdoDe25.addLeftChild(hijoIzquierdoDe10); 
		hijoIzquierdoDe10.addRightChild(new BinaryTree<Integer>(2)); //unica diferencia con arbol_Integers_B
		
		hijoIzquierdo.addLeftChild(hijoIzquierdoDe25);
		hijoIzquierdo.addRightChild(new BinaryTree<Integer>(32));
		
		BinaryTree<Integer> hijoDerecho= new BinaryTree<Integer>(78);
		ab.addLeftChild(hijoIzquierdo);
		ab.addRightChild(hijoDerecho);
		
		//hijoDerecho.addRightChild(new BinaryTree<Integer>(1)); 
		
		
		return ab;
	}
	
	//Para testear ejercicio 9
	/*
	  			20
	 		5		 	 30
	  -5 		 	50	 	 -9
	  				   4
	 
	 El nuevo arbol deberia ser:
			 				( 20 | 20 ) 
			( 25 | -15 ) 							( 50 | 10 ) 
	( 20 | -10 ) 					( 100 | 20 ) 					( 41 | -39 ) 
											( 104 | -46 ) 
	 */
	public static BinaryTree <Integer> arbol_Simple() {
		BinaryTree<Integer> raiz = new BinaryTree<Integer>(20);
		BinaryTree<Integer> hijoIzquierdoDeRaiz = new BinaryTree<Integer>(5);
		BinaryTree<Integer> hijoDerechoDeRaiz = new BinaryTree<Integer>(30);
		
		BinaryTree<Integer> hijoIzquierdoDe5 = new BinaryTree<Integer>(-5);
		hijoIzquierdoDeRaiz.addLeftChild(hijoIzquierdoDe5);
		
		BinaryTree<Integer> hijoIzquierdoDe30 = new BinaryTree<Integer>(50);
		BinaryTree<Integer> hijoDerechoDe30 = new BinaryTree<Integer>(-9);
		hijoDerechoDeRaiz.addRightChild(hijoDerechoDe30);
		hijoDerechoDeRaiz.addLeftChild(hijoIzquierdoDe30);
		
		hijoIzquierdoDe30.addRightChild(new BinaryTree<Integer>(4));
			
		raiz.addLeftChild(hijoIzquierdoDeRaiz);
		raiz.addRightChild(hijoDerechoDeRaiz);
		
		return raiz;
	}
}
