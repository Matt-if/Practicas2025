package objetos2.ej19_patrones_Filesystem;
import java.util.Date;

public abstract class FileOO2Decorator implements FileOO2Interface {

    protected final FileOO2Interface file;

    public FileOO2Decorator(FileOO2Interface file) {
        this.file = file;
    }

    @Override
    public abstract String prettyPrint();

    public String getName() {
        return file.getName();
    }

    public String getExt() {
        return file.getExt();
    }

    public Integer getSize() {
        return file.getSize();
    }

    public Date getCreationDate() {
        return file.getCreationDate();
    }

    public Date getModificationDate() {
        return file.getModificationDate();
    }

    public String getPermissions() {
        return file.getPermissions();
    }


}
