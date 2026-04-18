package tp2;

public class SumaYDiferencia {
	private int suma, diferencia;

	public SumaYDiferencia(int suma, int diferencia) {
		super();
		this.suma = suma;
		this.diferencia = diferencia;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public void setDiferencia(int diferencia) {
		this.diferencia = diferencia;
	}
	
	@Override
	public String toString() {
		return "( " + suma + " | " + diferencia + " )";
	}
	
	
}
