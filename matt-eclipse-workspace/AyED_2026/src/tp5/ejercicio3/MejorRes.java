package tp5.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class MejorRes {

	private int mejorDistancia = Integer.MAX_VALUE;
	private List<String> mejorCamino = new ArrayList<String>();
	
	public int getMejorDistancia() {
		return mejorDistancia;
	}
	public void setMejorDistancia(int mejorDistancia) {
		this.mejorDistancia = mejorDistancia;
	}
	public List<String> getMejorCamino() {
		return mejorCamino;
	}
	public void setMejorCamino(List<String> mejorCamino) {
		this.mejorCamino = mejorCamino;
	}
	
	
}
