package objetos.dos.ej18_fileoo2;

public class FileOO2 implements File {
	private String nombre;
	private String tamaño;
	private String extension;
	private String fechaCreacion;
	private String fechaModificacion;
	private String permisos;
	
	public FileOO2(String nombre, String tamaño, String extension, String fechaCreacion, String fechaModificacion,
			String permisos) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.extension = extension;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.permisos = permisos;
	}
	
	@Override
	public String prettyPrint() {
		// TODO Auto-generated method stub
		return "Los atributos del archivo son:";
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public String getTamaño() {
		// TODO Auto-generated method stub
		return tamaño;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return extension;
	}

	@Override
	public String getFechaCreacion() {
		// TODO Auto-generated method stub
		return fechaCreacion;
	}

	@Override
	public String getFechaModificacion() {
		// TODO Auto-generated method stub
		return fechaModificacion;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return permisos;
	}



}
