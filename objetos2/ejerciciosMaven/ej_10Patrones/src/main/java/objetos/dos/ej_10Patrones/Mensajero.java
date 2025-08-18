package objetos.dos.ej_10Patrones;

public class Mensajero {
	
	private MecanismoDeCifrado mecanismo;
	
	
	// Duda, la llave se crea aca ?
	public void enviar (String msj) {
		mecanismo.encriptar(msj);
		//se envia msj...
	}
	
	public void recibir (String msj) {
		mecanismo.encriptar(msj);
		//se recibe y se guarda msj...
	}

	public void setMecanismo(MecanismoDeCifrado mecanismo) {
		this.mecanismo = mecanismo;
	}
	
	
}
