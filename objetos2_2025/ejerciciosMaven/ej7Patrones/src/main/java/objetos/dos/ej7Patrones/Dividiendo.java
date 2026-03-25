package objetos.dos.ej7Patrones;

public class Dividiendo extends Estado {

	@Override
	public void handleSetValor(double unValor, Calculadora c) {
		if (unValor == 0) c.setEstado(new Error());
		else {
			c.setValorAcumulado(c.getValorAcumulado() / unValor);
			c.setEstado(new Inicial());
		}
	}
}
