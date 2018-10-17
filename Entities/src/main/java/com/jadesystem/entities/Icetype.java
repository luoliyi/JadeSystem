package com.jadesystem.entities;

import java.io.Serializable;

/**
 * @author 
 */
public class Icetype implements Serializable {
    /**
     * 编号
     */
    private Integer itid;

    /**
     * 名称
     */
    private String itname;

    private static final long serialVersionUID = 1L;

    public Integer getItid() {
        return itid;
    }

    public void setItid(Integer itid) {
        this.itid = itid;
    }

    public String getItname() {
        return itname;
    }

    public void setItname(String itname) {
        this.itname = itname;
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
        Icetype other = (Icetype) that;
        return (this.getItid() == null ? other.getItid() == null : this.getItid().equals(other.getItid()))
            && (this.getItname() == null ? other.getItname() == null : this.getItname().equals(other.getItname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getItid() == null) ? 0 : getItid().hashCode());
        result = prime * result + ((getItname() == null) ? 0 : getItname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", itid=").append(itid);
        sb.append(", itname=").append(itname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}