package objetos2.ej13_patrones_MonitoreoLineaProd;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		  return tank.heatPower(0)
			        && tank.mixerPower(0)
			        && tank.purge();
	}
}
