package objetos.dos.ej_13Patrones;

public class ConstructorDeVegetariano implements ConstructorDeSandwich {

	@Override
	public void construirPan(Sandwich s) {
		Pan pan = new Pan ("Con Semillas", 120.0 ); 
		s.addElemento(pan);
	}

	@Override
	public void construirPrincipal(Sandwich s) {
		Principal p = new Principal("Provoleta Grillada", 200.0);
		s.addElemento(p);

	}

	@Override
	public void construirAderezo(Sandwich s) {

	}

	@Override
	public void construirAdicional(Sandwich s) {
		Adicional adic = new Adicional("Berenjenas al escabeche", 100.0);
		s.addElemento(adic);

	}

}
