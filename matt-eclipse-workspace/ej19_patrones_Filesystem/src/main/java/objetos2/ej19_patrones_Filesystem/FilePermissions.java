package objetos2.ej19_patrones_Filesystem;

public class FilePermissions extends FileOO2Decorator {

    public FilePermissions(FileOO2Interface file) {
        super(file);
    }

    @Override
    public String prettyPrint() {
        return " | Permissions: " + getPermissions() + this.file.prettyPrint();
    }
}
