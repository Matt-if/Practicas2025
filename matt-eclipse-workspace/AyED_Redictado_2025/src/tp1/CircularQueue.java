package tp1;

public class CircularQueue <T> extends Queue <T>{
	
	// Permite rotar los elementos, haciéndolo circular. Retorna el elemento encolado.
	// Osea, el que esta primero en la cola pasa a ser ultimo y se retorna.
	public T shift() {
		T primero = data.remove(0);
		
		data.add(primero);
		
		return primero;
	}
}
