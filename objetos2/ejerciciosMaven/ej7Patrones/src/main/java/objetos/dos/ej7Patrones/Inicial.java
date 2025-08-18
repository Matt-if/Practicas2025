package objetos.dos.ej7Patrones;

public class Inicial extends Estado {

	@Override
	public void handleSetValor(double unValor, Calculadora c) {
		c.setValorAcumulado(unValor);
	}

	@Override
	public void handleMas(Calculadora c) {
		c.setEstado(new Sumando());
	}

	@Override
	public void handleMenos(Calculadora c) {
		c.setEstado(new Restando());

	}

	@Override
	public void handlePor(Calculadora c) {
		c.setEstado(new Multiplicando());

	}

	@Override
	public void handleDividido(Calculadora c) {
		c.setEstado(new Dividiendo());

	}

}
