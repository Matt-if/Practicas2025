package objetos.dos.ej18_fileoo2;

public class NombreDecorator extends FileDecorator {

	public NombreDecorator(File archivo) {
		super(archivo);
		// TODO Auto-generated constructor stub
	}

	public String specificPrettyPrint() {
		// TODO Auto-generated method stub
		return this.archivo.getNombre(); // ultimo cambio
	}
}
