package objetos2.ej13_patrones_MonitoreoLineaProd;

public class StubMixingTank extends MixingTank {

	@Override
	public boolean heatPower(int percentage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mixerPower(int percentage) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean purge() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double upTo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double temperature() {
		// TODO Auto-generated method stub
		return 0;
	}

}
