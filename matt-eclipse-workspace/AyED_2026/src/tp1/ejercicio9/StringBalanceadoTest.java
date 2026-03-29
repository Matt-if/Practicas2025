package tp1.ejercicio9;

public class StringBalanceadoTest {

	public static void main(String[] args) {
		
		System.out.println(ej9.testBalanceo("{()[()]}")); // true
		System.out.println(ej9.testBalanceo("{()[()]")); // false
		System.out.println(ej9.testBalanceo("{([()]}")); // false
		System.out.println(ej9.testBalanceo("(({()[()]}))")); // true
		System.out.println(ej9.testBalanceo("")); // true

	}

}
