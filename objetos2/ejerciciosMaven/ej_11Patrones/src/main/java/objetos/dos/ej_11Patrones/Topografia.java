package objetos.dos.ej_11Patrones;

public interface Topografia {
	
    public double calcularProporcionDeAgua();
    public double calcularProporcionDeTierra();

    public boolean esIgual(Topografia t);
    
	public boolean soyIgualAAgua();
	public boolean soyIgualATierra();
	public boolean soyIgualAPantano();
	public boolean soyIgualAMixta(Mixta m);

	//tambien se podria con un metodo igual(tipo t) que reciba por parametro cada tipo disinto de topografia
	/*
	 * public boolean esIgual (Topografia t) {
	 * 		return igual(this);
	 * }
	 */
	
	
}
