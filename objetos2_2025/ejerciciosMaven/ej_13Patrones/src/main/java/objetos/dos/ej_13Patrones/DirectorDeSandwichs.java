package objetos.dos.ej_13Patrones;

/* Nota gral de este EJERCICIO. No es necesario crear los objetos Pan, principal, aderezo, adicional. Basta con definirlo con un String en el objeto Elemento*/

public class DirectorDeSandwichs {

	public DirectorDeSandwichs() {
		super();
	}
	
	public Sandwich construirSandwich (ConstructorDeSandwich constructor) {
		Sandwich s = new Sandwich();
		
		constructor.construirPan(s);
		constructor.construirPrincipal(s);
		constructor.construirAderezo(s);
		constructor.construirAdicional(s);
		
		return s;
	}

	//Tambien podria pasarse el constructor por parametro para construir el director y despues usar un director para cada sandiwch que se quiere construir o meter un setter que te cambie el constructor guardado.

	
}
