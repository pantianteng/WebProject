package vo;

import java.io.Serializable;

/**
 * goodsLocation
 * @author 
 */
public class Goodslocation implements Serializable {
    private Integer id;

    private String goodslocation;

    private static final long serialVersionUID = 1L;

    public Goodslocation(Integer id, String goodslocation) {
        this.id = id;
        this.goodslocation = goodslocation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodslocation() {
        return goodslocation;
    }

    public void setGoodslocation(String goodslocation) {
        this.goodslocation = goodslocation;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Goodslocation{" +
                "id=" + id +
                ", goodslocation='" + goodslocation + '\'' +
                '}';
    }
}