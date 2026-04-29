package objetos2.ej13_patrones_MonitoreoLineaProd;

public class Purge extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		// t t t, t t f , t f x, f x x: casos a testear
		  return tank.heatPower(0)
			        && tank.mixerPower(0)
			        && tank.purge();
	}
}
