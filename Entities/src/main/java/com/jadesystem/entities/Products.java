package com.jadesystem.entities;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class Products implements Serializable {
    /**
     * 编号
     */
    private Integer pid;

    /**
     * 名称
     */
    private String pname;

    /**
     * 颜色外键
     */
    private Integer pcid;

    /**
     * 品牌外键
     */
    private Integer pbid;

    /**
     * 嵌体外键
     */
    private Integer piid;

    /**
     * 寓意外键
     */
    private Integer pmid;

    /**
     * 刻痕外键
     */
    private Integer pitid;

    /**
     * 悬挂式外键
     */
    private Integer phtid;

    /**
     * 市场价格
     */
    private BigDecimal pmarketprice;

    /**
     * 成本价格
     */
    private BigDecimal pmyprice;

    /**
     * 图片
     */
    private String ppicture;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPcid() {
        return pcid;
    }

    public void setPcid(Integer pcid) {
        this.pcid = pcid;
    }

    public Integer getPbid() {
        return pbid;
    }

    public void setPbid(Integer pbid) {
        this.pbid = pbid;
    }

    public Integer getPiid() {
        return piid;
    }

    public void setPiid(Integer piid) {
        this.piid = piid;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public Integer getPitid() {
        return pitid;
    }

    public void setPitid(Integer pitid) {
        this.pitid = pitid;
    }

    public Integer getPhtid() {
        return phtid;
    }

    public void setPhtid(Integer phtid) {
        this.phtid = phtid;
    }

    public BigDecimal getPmarketprice() {
        return pmarketprice;
    }

    public void setPmarketprice(BigDecimal pmarketprice) {
        this.pmarketprice = pmarketprice;
    }

    public BigDecimal getPmyprice() {
        return pmyprice;
    }

    public void setPmyprice(BigDecimal pmyprice) {
        this.pmyprice = pmyprice;
    }

    public String getPpicture() {
        return ppicture;
    }

    public void setPpicture(String ppicture) {
        this.ppicture = ppicture;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Products other = (Products) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()))
            && (this.getPcid() == null ? other.getPcid() == null : this.getPcid().equals(other.getPcid()))
            && (this.getPbid() == null ? other.getPbid() == null : this.getPbid().equals(other.getPbid()))
            && (this.getPiid() == null ? other.getPiid() == null : this.getPiid().equals(other.getPiid()))
            && (this.getPmid() == null ? other.getPmid() == null : this.getPmid().equals(other.getPmid()))
            && (this.getPitid() == null ? other.getPitid() == null : this.getPitid().equals(other.getPitid()))
            && (this.getPhtid() == null ? other.getPhtid() == null : this.getPhtid().equals(other.getPhtid()))
            && (this.getPmarketprice() == null ? other.getPmarketprice() == null : this.getPmarketprice().equals(other.getPmarketprice()))
            && (this.getPmyprice() == null ? other.getPmyprice() == null : this.getPmyprice().equals(other.getPmyprice()))
            && (this.getPpicture() == null ? other.getPpicture() == null : this.getPpicture().equals(other.getPpicture()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        result = prime * result + ((getPcid() == null) ? 0 : getPcid().hashCode());
        result = prime * result + ((getPbid() == null) ? 0 : getPbid().hashCode());
        result = prime * result + ((getPiid() == null) ? 0 : getPiid().hashCode());
        result = prime * result + ((getPmid() == null) ? 0 : getPmid().hashCode());
        result = prime * result + ((getPitid() == null) ? 0 : getPitid().hashCode());
        result = prime * result + ((getPhtid() == null) ? 0 : getPhtid().hashCode());
        result = prime * result + ((getPmarketprice() == null) ? 0 : getPmarketprice().hashCode());
        result = prime * result + ((getPmyprice() == null) ? 0 : getPmyprice().hashCode());
        result = prime * result + ((getPpicture() == null) ? 0 : getPpicture().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pid=").append(pid);
        sb.append(", pname=").append(pname);
        sb.append(", pcid=").append(pcid);
        sb.append(", pbid=").append(pbid);
        sb.append(", piid=").append(piid);
        sb.append(", pmid=").append(pmid);
        sb.append(", pitid=").append(pitid);
        sb.append(", phtid=").append(phtid);
        sb.append(", pmarketprice=").append(pmarketprice);
        sb.append(", pmyprice=").append(pmyprice);
        sb.append(", ppicture=").append(ppicture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}