package vo;

import java.io.Serializable;


/**
 * secondDirectory
 * @author 
 */

public class Seconddirectory implements Serializable {
    private Integer id;

    private Integer fid;

    private String name;

    private static final long serialVersionUID = 1L;

    public Seconddirectory(Integer id, Integer fid, String name) {
        this.id = id;
        this.fid = fid;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Seconddirectory{" +
                "id=" + id +
                ", fid=" + fid +
                ", name='" + name + '\'' +
                '}';
    }
}