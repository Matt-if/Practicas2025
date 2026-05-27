package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.List;

public abstract class HomeWeatherStationDecorator implements WeatherData {

	protected WeatherData hws;
	
	public HomeWeatherStationDecorator(WeatherData hws) {
		super();
		this.hws = hws;
	}

	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return hws.getTemperatura();
	}

	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return hws.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return hws.getRadiacionSolar();
	}

	@Override
	public List <Double> getTemperaturas() {
		// TODO Auto-generated method stub
		return hws.getTemperaturas();
	}

}
