package vo;

import java.io.Serializable;

/**
 * firstDirectory
 * @author 
 */
public class Firstdirectory implements Serializable {
    private Integer id;

    private String name;

    private static final long serialVersionUID = 1L;

    public Firstdirectory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Firstdirectory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}