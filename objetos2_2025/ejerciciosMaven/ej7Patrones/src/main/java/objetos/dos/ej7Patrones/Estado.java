package objetos.dos.ej7Patrones;

public abstract class Estado {
    
	public abstract void handleSetValor(double unValor, Calculadora c);
	
	public String handleResultado(Calculadora c) {
		return Double.toString(c.getValorAcumulado());
	}
    
	public void handleMas(Calculadora c) {
		c.setEstado(new Error());
		
	}

	public void handleMenos(Calculadora c) {
		c.setEstado(new Error());
		
	}

	public void handlePor(Calculadora c) {
		c.setEstado(new Error());
		
	}

	public void handleDividido(Calculadora c) {
		c.setEstado(new Error());
		
	}
}
