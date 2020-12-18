package vo;

import java.io.Serializable;

/**
 * goods
 * @author 
 */
public class Goods implements Serializable {
    private String goodsid;

    private String goodscode;

    private String goodschrname;

    private int goodslocation;

    private int payunit;

    private int firstdirectory;

    private int seconddirectory;

    private static final long serialVersionUID = 1L;

    public Goods(String goodsid, String goodscode, String goodschrname, int goodslocation, int payunit, int firstdirectory, int seconddirectory) {
        this.goodsid = goodsid;
        this.goodscode = goodscode;
        this.goodschrname = goodschrname;
        this.goodslocation = goodslocation;
        this.payunit = payunit;
        this.firstdirectory = firstdirectory;
        this.seconddirectory = seconddirectory;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getGoodscode() {
        return goodscode;
    }

    public void setGoodscode(String goodscode) {
        this.goodscode = goodscode;
    }

    public String getGoodschrname() {
        return goodschrname;
    }

    public void setGoodschrname(String goodschrname) {
        this.goodschrname = goodschrname;
    }

    public int getGoodslocation() {
        return goodslocation;
    }

    public void setGoodslocation(int goodslocation) {
        this.goodslocation = goodslocation;
    }

    public int getPayunit() {
        return payunit;
    }

    public void setPayunit(int payunit) {
        this.payunit = payunit;
    }

    public int getFirstdirectory() {
        return firstdirectory;
    }

    public void setFirstdirectory(int firstdirectory) {
        this.firstdirectory = firstdirectory;
    }

    public int getSeconddirectory() {
        return seconddirectory;
    }

    public void setSeconddirectory(int seconddirectory) {
        this.seconddirectory = seconddirectory;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsid='" + goodsid + '\'' +
                ", goodscode='" + goodscode + '\'' +
                ", goodschrname='" + goodschrname + '\'' +
                ", goodslocation=" + goodslocation +
                ", payunit=" + payunit +
                ", firstdirectory=" + firstdirectory +
                ", seconddirectory=" + seconddirectory +
                '}';
    }
}

