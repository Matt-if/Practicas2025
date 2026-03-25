package objetos.dos.ej_13Patrones;

public class ConstructorDeSinTACC implements ConstructorDeSandwich {

	@Override
	public void construirPan(Sandwich s) {
		Pan pan = new Pan ("Chipa", 150.0); 
		s.addElemento(pan);
	}

	@Override
	public void construirPrincipal(Sandwich s) {
		Principal p = new Principal("Carne de Pollo", 250.0);
		s.addElemento(p);

	}

	@Override
	public void construirAderezo(Sandwich s) {
		Aderezo ad = new Aderezo("Salsa Tartara", 18.0);
		s.addElemento(ad);

	}

	@Override
	public void construirAdicional(Sandwich s) {
		Adicional adic = new Adicional("Verduras Grilladas", 200.0);
		s.addElemento(adic);

	}

}
