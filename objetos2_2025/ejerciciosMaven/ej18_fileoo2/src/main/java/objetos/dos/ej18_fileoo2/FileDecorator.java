package objetos.dos.ej18_fileoo2;

public abstract class FileDecorator implements File {
	protected File archivo; //para recibir a un FileOO2 o un Decorador

	public FileDecorator(File archivo) {
		super();
		this.archivo = archivo;
	}

	public abstract String specificPrettyPrint();
	
	public String prettyPrintBasico() {
		// TODO Auto-generated method stub
		return archivo.prettyPrint() + " " + this.specificPrettyPrint();
	}
	
	public String prettyPrint() {
		return prettyPrintBasico().strip();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return archivo.getNombre();
	}

	@Override
	public String getTamaño() {
		// TODO Auto-generated method stub
		return archivo.getTamaño();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return archivo.getExtension();
	}

	@Override
	public String  getFechaCreacion() {
		// TODO Auto-generated method stub
		return archivo.getFechaCreacion();
	}

	@Override
	public String  getFechaModificacion() {
		// TODO Auto-generated method stub
		return archivo.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return archivo.getPermisos();
	}
	

}
