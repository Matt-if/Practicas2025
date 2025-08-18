package objetos.dos.ej19_estacionMeteorologica;

public class AdapterHomeWeatherStation {

	private HomeWeatherStation hws;
	private TempStrategy tempStrat;
	
	public String displayData() {
		return "";
	}

	public TempStrategy getTempStrat() {
		return tempStrat;
	}

	public void setTempStrat(TempStrategy tempStrat) {
		this.tempStrat = tempStrat;
	}
	
}
