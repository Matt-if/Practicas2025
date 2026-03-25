package tp1;

public class ej1 {

	public static void imprimirConForEnterosEntre (int a, int b) {
		int i;
		for (i = a; i <= b; i++) {
			System.out.println(i);
		}
		
	}
	
	public static void imprimirConWhileEnterosEntre (int a, int b) {
		int i = a;
		while (i <= b) {
			System.out.println(i);
			i++;
		}
	}

	
	public static void imprimirEnterosEntre (int a, int b) {
		
		if (a <= b) { 
			System.out.println(a);
			imprimirEnterosEntre(++a, b); // si usas a++ la variable no se incrementa antes de hacer el llamado y termina generando un error de memoria.
		}
		
	}
	
	
	public static void main(String[] args) {
		
		imprimirConForEnterosEntre(1, 5);
		imprimirConWhileEnterosEntre(10, 15);
		imprimirEnterosEntre(100, 105);
	}

}
