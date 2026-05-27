package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.List;

public class HomeWeatherStationCelsius extends HomeWeatherStation {

	// C = (°F - 32) ÷ 1.8
	private double FarenheitToCelsius (double Fh) {
		return (Fh - 32) / 1.8;
	}
	
	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return this.FarenheitToCelsius(super.getTemperatura()) ;
	}
	
	@Override
	public List <Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return super.getTemperaturas().stream().map(this::FarenheitToCelsius).toList();
	}
	
	public String displayData() {
		// TODO Auto-generated method stub
		return "Temperatura C: " + this.getTemperatura() + 
				"Presión atmosf: " + this.getPresion() + 
				"Radiación solar: " + this.getRadiacionSolar();
	}

}
