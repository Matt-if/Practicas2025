package objetos.dos.ej_11Patrones;

public class Tierra implements Topografia {

	@Override
	public double calcularProporcionDeAgua() {
		return 0;
	}

	@Override
	public double calcularProporcionDeTierra() {
		return 1;
	}

	@Override
	public boolean esIgual(Topografia t) {
		// TODO Auto-generated method stub
		return t.soyIgualATierra();
	}
	
	@Override
	public boolean soyIgualAAgua() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualATierra() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean soyIgualAPantano() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualAMixta(Mixta m) {
		// TODO Auto-generated method stub
		return false;
	}
}
