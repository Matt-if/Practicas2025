package objetos.dos.ej19_estacionMeteorologica;

public class HomeWeatherStation implements WeatherData {

	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private double [] temperaturas;
	

	//retorna la temperatura en grados Fahrenheit. 
	@Override
	public double getTemperatura() {
		// TODO Auto-generated method stub
		return temperatura;
	}

	//retorna la presión atmosférica en hPa
	@Override
	public double getPresion() {
		// TODO Auto-generated method stub
		return presion;
	}

	@Override
	public double getRadiacionSolar() {
		// TODO Auto-generated method stub
		return radiacionSolar;
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, 
	// en grados Fahrenheit.
	@Override
	public double[] getTemperaturas() {
		// TODO Auto-generated method stub
		return temperaturas;
	}

	//retorna  un reporte de todos los datos
	@Override
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() + 
				"Presión atmosf: " + this.getPresion() +
			   	"Radiación solar: " + this.getRadiacionSolar();
	}

}
