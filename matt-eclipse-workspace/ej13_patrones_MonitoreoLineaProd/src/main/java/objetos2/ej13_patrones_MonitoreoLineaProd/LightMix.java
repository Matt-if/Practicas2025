package objetos2.ej13_patrones_MonitoreoLineaProd;

public class LightMix extends ProcessStep {

	@Override
	protected boolean basicExecute(MixingTank tank) {
		return tank.heatPower(20)
		        && tank.mixerPower(5);
	}

}
