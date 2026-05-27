package objetos2.ej21_patrones_HomeWeatherStation;

import java.util.List;

public class MinMaxTempDecorator extends HomeWeatherStationDecorator {

	public MinMaxTempDecorator(WeatherData hws) {
		super(hws);
		// TODO Auto-generated constructor stub
	}

	private String MinMaxTemp () {
		
		List <Double> lista = this.hws.getTemperaturas().stream()
				.sorted((t1, t2) -> t1.compareTo(t2)).toList();
		 
		 return " Minimo: " + lista.get(0).toString() + " Maximo: " +  lista.get(lista.size() - 1).toString(); 
	}
	
	@Override
	public String displayData() {
		// TODO Auto-generated method stub
		return  this.hws.displayData() + " - " + this.MinMaxTemp() + "; ";
	}

}
