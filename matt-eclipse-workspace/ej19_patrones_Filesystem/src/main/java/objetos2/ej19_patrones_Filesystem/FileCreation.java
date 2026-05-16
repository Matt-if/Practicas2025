package objetos2.ej19_patrones_Filesystem;
public class FileCreation extends FileOO2Decorator {

    public FileCreation(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return " | Created: " + getCreationDate() + this.file.prettyPrint();
    }
}
