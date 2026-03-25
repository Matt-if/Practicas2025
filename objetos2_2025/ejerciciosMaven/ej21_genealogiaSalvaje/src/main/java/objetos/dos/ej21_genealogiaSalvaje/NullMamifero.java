package objetos.dos.ej21_genealogiaSalvaje;

public class NullMamifero extends Mamifero {

	@Override
	public Mamifero getPadre() {
		return null;
	}
	
	@Override
	public Mamifero getMadre() {
		return null;
	}

}
