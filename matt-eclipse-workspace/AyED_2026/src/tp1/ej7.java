package tp1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ej7 {

	//d)
	public static void crearYCopiarEstudiantes () {
		List<Estudiante> est = new ArrayList<Estudiante>();
		est.add(new Estudiante("a", "b", "c", "d", "e"));
		est.add(new Estudiante("a2", "b2", "c2", "d2", "e2"));
		est.add(new Estudiante("a3", "b3", "c3", "d3", "e3"));
		
		List<Estudiante> est2  = new ArrayList<Estudiante>(est);
		//List<Estudiante> est2  = new ArrayList<Estudiante>();		
		//est2.addAll(est); //esta va a ser la mas comun de usar para copiar una lista.
		
		//obviamente se imprime lo mismo
		System.out.println(est.toString());
		System.out.println(est2.toString());
		
		//cambio nombre del primer estudiante
		est.get(0).setNombre("Pepe");
		System.out.println("Ahora con el cambio de nombre:");
		System.out.println(est.toString());
		System.out.println(est2.toString());
		
		// e) Recordar que el contains usa el equals, 
		// El equals, por defecto, compara por direcciones de memoria de los objetos si no lo definimos nosotros.
		// No tener definido el equals genera el mismo problema que cuando usamos el == para comparar.
		Estudiante nuevo = new Estudiante("nuevo", "b", "c", "d", "e");
		if (!est.contains(nuevo)) est.add(nuevo);
		System.out.println(est.toString());
		System.out.println(nuevo.equals(new Estudiante("nuevo", "b", "c", "d", "e")));
		
	}
	
	// f)
	public static boolean esCapicua(List<Integer> lista) {
		
		int i,f;
		
		for (i=0, f=lista.size()-1; i<=lista.size()/2 ;i++, f--) {
			if (lista.get(i) != lista.get(f)) return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// a)
		List<String> arrlist = new ArrayList<>();
		for (String arg: args) arrlist.add(arg);
		for (String arg: arrlist) System.out.println(arg);
		// b) La unica diferencia es en la instanciacion de la variable arrlist.
		// c) for tradicional, while, iterator

		// d) y e)
		crearYCopiarEstudiantes();
		
		// f) Escriba un método que devuelva verdadero o falso si la secuencia almacenada en la lista es o no capicúa
		List<Integer> nros = new ArrayList<Integer>(List.of(1,2,3,2,1)); //true
		List<Integer> nros2 = new ArrayList<Integer>(List.of(1,2,3,2,1,9)); //false
		List<Integer> nros3 = new ArrayList<Integer>(List.of(1,2,3,2)); //false
		List<Integer> nros4 = new ArrayList<Integer>(List.of(1,1,1)); //true
		List<Integer> nros5 = new ArrayList<Integer>(List.of(1)); //true
		List<Integer> nros6 = new ArrayList<Integer>(List.of(1,2,2,1)); //true
		
		System.out.println("Resultados esCapicua:");
		System.out.println(esCapicua(nros)+ " " + esCapicua(nros2)+ " " + esCapicua(nros3)+ " " + esCapicua(nros4) + " " + esCapicua(nros5)+ " " + esCapicua(nros6));	

	}

}
