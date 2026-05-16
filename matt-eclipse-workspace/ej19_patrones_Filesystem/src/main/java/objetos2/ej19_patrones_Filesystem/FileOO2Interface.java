package objetos2.ej19_patrones_Filesystem;

import java.util.Date;

public interface FileOO2Interface {

    String prettyPrint();

	String getPermissions();

	Date getModificationDate();

	Date getCreationDate();

	Integer getSize();

	String getExt();

	String getName();
}
