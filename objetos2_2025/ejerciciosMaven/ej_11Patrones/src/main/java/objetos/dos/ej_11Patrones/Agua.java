package objetos.dos.ej_11Patrones;

public class Agua implements Topografia {

	@Override
	public double calcularProporcionDeAgua() {
		return 1;
	}

	@Override
	public double calcularProporcionDeTierra() {
		return 0;
	}

	@Override
	public boolean esIgual(Topografia t) {
		// TODO Auto-generated method stub
		return t.soyIgualAAgua();
	}

	@Override
	public boolean soyIgualAAgua() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean soyIgualATierra() {
		// TODO Auto-generated method stub
		return false;
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
