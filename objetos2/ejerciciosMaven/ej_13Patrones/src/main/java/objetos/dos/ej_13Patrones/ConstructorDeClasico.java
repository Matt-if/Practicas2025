package objetos.dos.ej_13Patrones;

public class ConstructorDeClasico implements ConstructorDeSandwich {

	public void construirPan(Sandwich s) {
		Pan pan = new Pan ("brioche", 100.0);
		s.addElemento(pan);

	}

	@Override
	public void construirPrincipal(Sandwich s) {
		Principal p = new Principal("Carne Ternera", 300.0);
		s.addElemento(p);

	}

	@Override
	public void construirAderezo(Sandwich s) {
		Aderezo ad = new Aderezo("A base de Mayonesa", 20.0);
		s.addElemento(ad);

	}

	@Override
	public void construirAdicional(Sandwich s) {
		Adicional adic = new Adicional("Tomate", 80.0);
		s.addElemento(adic);

	}

}
