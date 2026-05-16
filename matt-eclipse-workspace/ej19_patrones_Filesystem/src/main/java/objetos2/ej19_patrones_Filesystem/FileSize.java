package objetos2.ej19_patrones_Filesystem;
public class FileSize extends FileOO2Decorator {

    public FileSize(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return " | Size: " + getSize() + " bytes" + this.file.prettyPrint();
    }
}
