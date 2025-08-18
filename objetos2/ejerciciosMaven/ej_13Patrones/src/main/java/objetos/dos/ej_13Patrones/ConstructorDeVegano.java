package objetos.dos.ej_13Patrones;

public class ConstructorDeVegano implements ConstructorDeSandwich {

	@Override
	public void construirPan(Sandwich s) {
		Pan pan = new Pan ("Integral", 100.0); 
		s.addElemento(pan);
	}

	@Override
	public void construirPrincipal(Sandwich s) {
		Principal p = new Principal("Milanesa Girgolas", 500.0);
		s.addElemento(p);

	}

	@Override
	public void construirAderezo(Sandwich s) {
		Aderezo ad = new Aderezo("Salsa Criolla", 20.0);
		s.addElemento(ad);

	}

	@Override
	public void construirAdicional(Sandwich s) {

	}

}
