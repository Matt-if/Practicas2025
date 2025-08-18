package objetos.dos.ej_11Patrones;

public class Pantano implements Topografia {

	@Override
	public double calcularProporcionDeAgua() {
		// TODO Auto-generated method stub
		return 0.7;
	}

	@Override
	public double calcularProporcionDeTierra() {
		// TODO Auto-generated method stub
		return 0.3;
	}

	@Override
	public boolean esIgual(Topografia t) {
		// TODO Auto-generated method stub
		return t.soyIgualAPantano();
	}
	
	@Override
	public boolean soyIgualAAgua() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualATierra() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean soyIgualAPantano() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean soyIgualAMixta(Mixta m) {
		// TODO Auto-generated method stub
		return false;
	}

}
