package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.List;

public interface WeatherData {

	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List <Double> getTemperaturas();
	public String displayData();
}
