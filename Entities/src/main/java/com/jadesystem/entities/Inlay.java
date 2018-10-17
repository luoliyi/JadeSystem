package com.jadesystem.entities;

import java.io.Serializable;

/**
 * @author 
 */
public class Inlay implements Serializable {
    /**
     * 编号
     */
    private Integer iid;

    /**
     * 名称
     */
    private String iname;

    private static final long serialVersionUID = 1L;

    public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
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
        Inlay other = (Inlay) that;
        return (this.getIid() == null ? other.getIid() == null : this.getIid().equals(other.getIid()))
            && (this.getIname() == null ? other.getIname() == null : this.getIname().equals(other.getIname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIid() == null) ? 0 : getIid().hashCode());
        result = prime * result + ((getIname() == null) ? 0 : getIname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", iid=").append(iid);
        sb.append(", iname=").append(iname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}