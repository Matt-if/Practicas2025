package tp1;
import tp1.Datos;

public class ej5 {
	
	// a)
	public static Datos calcularMinMaxPromConReturn (int [] a) {
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum = 0;
		double prom;
		
		for (int i = 0; i<= a.length; i++) {
			if (a[i] < min) min = a[i];
			if (a[i] > max) max = a[i];
			sum += a[i]; 
		}
		prom = sum / a.length;
		
		return new Datos(min, max, prom);
	}
	
	// b)
	public static void calcularMinMaxPromSinReturn (int [] a, Datos d) {
		int min = Integer.MIN_VALUE, max = Integer.MAX_VALUE, sum = 0;
		double prom;
		
		for (int i = 0; i<= a.length; i++) {
			if (a[i] < min) min = a[i];
			if (a[i] > max) max = a[i];
			sum += a[i]; 
		}
		prom = sum / a.length;
		
		d.setMin(min); d.setMax(max); d.setProm(prom);
	}
	
	// c) es casi lo mismo que el b) pero la variable Datos es de clase entonces el metodo la modifica directamente,
	// entonces no necesita ser pasada por parametros pero la verdad no tiene mucha gracia.
	
	public static void main(String[] args) {
		int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 8};

	}

}
