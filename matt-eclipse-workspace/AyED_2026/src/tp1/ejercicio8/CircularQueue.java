package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T> {

	public T shift() {
		T temp = this.data.remove(0);
		this.data.add(temp);
		return temp;	
	}
}
