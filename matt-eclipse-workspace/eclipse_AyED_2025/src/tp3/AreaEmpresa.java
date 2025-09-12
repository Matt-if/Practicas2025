package tp3;

public class AreaEmpresa {
	private String nombreArea;
	private int tardanzaTransmision;
	
	public AreaEmpresa(String nombreArea, int tardanzaTransmision) {
		super();
		this.nombreArea = nombreArea;
		this.tardanzaTransmision = tardanzaTransmision;
	}

	public String getNombreArea() {
		return nombreArea;
	}

	public int getTardanzaTransmision() {
		return tardanzaTransmision;
	}

}
