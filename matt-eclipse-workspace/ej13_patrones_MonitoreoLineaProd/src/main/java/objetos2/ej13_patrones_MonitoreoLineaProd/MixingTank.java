package objetos2.ej13_patrones_MonitoreoLineaProd;

public abstract class MixingTank {

	public abstract boolean heatPower(int percentage);
	public abstract boolean mixerPower(int percentage);
	public abstract boolean purge();
	public abstract double upTo();
	public abstract double temperature();
	/*
	No se dispone de una implementación concreta de MixingTank pero su comportamiento esperado es el siguiente:

	heatPower: configura el nivel potencia de la fuente de calor del tanque de 0 a 100
	mixerPower: configura el nivel de potencia de la mezcladora del tanque de 0 a 100
	purge: comanda al tanque para que se desagote
	upTo: retorna el volumen ocupado del tanque de 0 a 100
	temperature: retorna la temperatura del contenido del tanque
	*/
}
