package objetos2.ej19_patrones_Filesystem;
public class FileName extends FileOO2Decorator {

    public FileName(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return " | Name: " + getName() + this.file.prettyPrint();
    }
}
