package objetos2.ej19_patrones_Filesystem;
public class FileModification extends FileOO2Decorator {

    public FileModification(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return  " | Modified: " + getModificationDate() + this.file.prettyPrint();
    }
}
