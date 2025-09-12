package tp2;

public class ej9dataNodo {
	private int sumaDelCamino = 0;
	private int difEntrePadreYo = 0;
	
	public ej9dataNodo() {
		super();
	}
	
	public int getSumaDelCamino() {
		return sumaDelCamino;
	}

	public void setSumaDelCamino(int sumaDelCamino) {
		this.sumaDelCamino = sumaDelCamino;
	}

	public int getDifEntrePadreYo() {
		return difEntrePadreYo;
	}

	public void setDifEntrePadreYo(int difEntrePadreYo) {
		this.difEntrePadreYo = difEntrePadreYo;
	}

	@Override
	public String toString() {
		return sumaDelCamino + " | " + difEntrePadreYo;
	}
}
