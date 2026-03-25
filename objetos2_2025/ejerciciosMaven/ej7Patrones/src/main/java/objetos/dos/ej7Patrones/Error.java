package objetos.dos.ej7Patrones;

public class Error extends Estado {
	
	@Override
	public String handleResultado(Calculadora c) {
		return "Error";
	}

	public void handleSetValor(double unValor, Calculadora c) {
		// TODO Auto-generated method stub
		
	}
}
