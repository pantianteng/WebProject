package vo;

import java.io.Serializable;

/**
 * payUnit
 * @author 
 */
public class Payunit implements Serializable {
    private Integer id;

    private String payunit;

    private static final long serialVersionUID = 1L;

    public Payunit(Integer id, String payunit) {
        this.id = id;
        this.payunit = payunit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayunit() {
        return payunit;
    }

    public void setPayunit(String payunit) {
        this.payunit = payunit;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public String toString() {
        return "Payunit{" +
                "id=" + id +
                ", payunit='" + payunit + '\'' +
                '}';
    }
}