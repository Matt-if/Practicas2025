package objetos.dos.ej19_estacionMeteorologica;

public interface WeatherData {
    public double getTemperatura();
    public double getPresion();
    public double getRadiacionSolar();
    public double [] getTemperaturas();
    public String displayData();
}
