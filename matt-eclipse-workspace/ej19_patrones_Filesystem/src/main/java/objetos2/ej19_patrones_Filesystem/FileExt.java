package objetos2.ej19_patrones_Filesystem;
public class FileExt extends FileOO2Decorator {

    public FileExt(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return " | Ext: " + getExt() + this.file.prettyPrint();
    }
}
