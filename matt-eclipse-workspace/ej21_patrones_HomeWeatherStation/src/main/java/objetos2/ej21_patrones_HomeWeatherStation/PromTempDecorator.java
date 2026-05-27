package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.List;

public class PromTempDecorator extends HomeWeatherStationDecorator {

	
	public PromTempDecorator(WeatherData hws) {
		super(hws);
		// TODO Auto-generated constructor stub
	}

	private String TempProm () {
		
		return this.hws.getTemperaturas().stream()
				.mapToDouble(t -> t)
				.average()
				.toString();
	}
	
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return this.hws.displayData() + " - Prom Temp: " + this.TempProm();
	}

}
