package objetos2.ej13_patrones_MonitoreoLineaProd;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		// t t , t f , f x: casos a testear
		return tank.heatPower(20)
		        && tank.mixerPower(5);
	}

}
