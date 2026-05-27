package objetos2.ej21_patrones_HomeWeatherStation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestHWS {

	HomeWeatherStation hws;
	HomeWeatherStationCelsius hwsC;
	PromTempDecorator ptD;
	MinMaxTempDecorator mmtD, mmtD2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		hws = new HomeWeatherStation();
		hwsC = new HomeWeatherStationCelsius();
	}

	@Test
	void test() {
		assertNotNull(hws.getTemperatura());
	}
	
	@Test
	void testTempEnCelsius () {
		double t = hws.getTemperatura();
		
		assertEquals((t - 32) / 1.8, hwsC.getTemperatura());
	}
	
	@Test 
	void testDisplayData () {
		mmtD = new MinMaxTempDecorator(new PromTempDecorator(hws));
		mmtD2 = new MinMaxTempDecorator(new PromTempDecorator(hwsC));
		
		System.out.println(mmtD.displayData());
		System.out.println(mmtD2.displayData());
	}

}
