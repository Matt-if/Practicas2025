package objetos2.ej19_patrones_Filesystem;

import java.util.Date;


public class FileOO2 implements FileOO2Interface {

    private String  name;
    private String  ext;
    private Integer size;
    private Date    creationDate;
    private Date    modificationDate;
    private String  permissions;

    public FileOO2(String name, String ext, Integer size,
                   Date creationDate, Date modificationDate,
                   String permissions) {
        this.name             = name;
        this.ext              = ext;
        this.size             = size;
        this.creationDate     = creationDate;
        this.modificationDate = modificationDate;
        this.permissions      = permissions;
    }

    public String  getName()             { return name; }
    public String  getExt()              { return ext; }
    public Integer getSize()             { return size; }
    public Date    getCreationDate()     { return creationDate; }
    public Date    getModificationDate() { return modificationDate; }
    public String  getPermissions()      { return permissions; }

    @Override
    public String prettyPrint() {
        return "";
    }
}
