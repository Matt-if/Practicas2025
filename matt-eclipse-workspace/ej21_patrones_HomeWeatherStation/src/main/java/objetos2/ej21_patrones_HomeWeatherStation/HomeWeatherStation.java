package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.ArrayList;
import java.util.List;

public class HomeWeatherStation implements WeatherData {
	
	// temps que ya deberian estar guardadas por funcionalidad que no tiene nada q ver con nosotros.
	private List <Double> temperaturas = new ArrayList<Double>(List.of(40.0, 90.0, 60.0, 80.0, 90.0, 50.0, 88.0, 39.0));
	
	@Override
	public double getTemperatura() {

		return 86;
	}

	// en hPa
	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return 10;
	}

	// en kW/h
	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return 1500;
	}

	@Override
	public List <Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return temperaturas;
	}

	public String displayData() {
		// TODO Auto-generated method stub
		return "Temperatura F: " + this.getTemperatura() + 
				"Presión atmosf: " + this.getPresion() + 
				"Radiación solar: " + this.getRadiacionSolar();
	}

}
