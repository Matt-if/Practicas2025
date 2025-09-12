package tp1;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> extends Sequence<T> {
	// Se usa ArrayList y se agregan los elementos al final para evitar corrimientos.
	
	private List<T> data;
	
	public Stack() {
		data = new ArrayList<T>();
	}
	
	public void push(T dato) {
		//agrego al tope (final del arrayList)
		data.add(data.size()-1, dato);
	}
	
	public T pop() {
		//Remuevo el que este al tope de la pila
		return data.remove(data.size()-1);
	}
	
	public T top() {
		return data.get(data.size()-1);
	}
	
	@Override
	public int size() {
		return data.size();
	}
	
	@Override
	public boolean isEmpty() {
		return data.size()==0;
	}
	
	@Override
	public String toString() {
		String str = "[";
		
		for(T d: data)
			str = str + d +", ";
		
		str = str.substring(0,str.length()-2)+"]";
		
		return str;
	}
}
