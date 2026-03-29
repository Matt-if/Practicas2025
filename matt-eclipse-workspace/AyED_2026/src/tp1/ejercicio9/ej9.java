package tp1.ejercicio9;

import tp1.ejercicio8.Stack;

public class ej9 {

	// Estamos analizando si un String es BALANCEADO, por eso --> "{( ) [ ( ) ] }" o "({}[])" o "[({})]" == True
	public static boolean testBalanceo (String cadena) {
		Stack<Character> pila = new Stack<Character>();
		
		for (int i = 0; i < cadena.length(); i++) {
			char caracter = cadena.charAt(i);
				switch (caracter) {
					case '(':
						pila.push(caracter);
						break;
					case ')':
						if (!pila.isEmpty() && pila.top() == '(')
							pila.pop();
						break;
					case '[':
						pila.push(caracter);
						break;
					case ']':
						if (!pila.isEmpty() && pila.top() == '[')
							pila.pop();
						break;
					case '{':
						pila.push(caracter);
						break;
					case '}':
						if (!pila.isEmpty() && pila.top() == '{')
							pila.pop();
						break;
				}
		}
		
		return pila.isEmpty();
	}
}
