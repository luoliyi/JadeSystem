package com.jadesystem.entities;

import java.io.Serializable;

/**
 * @author 
 */
public class Hangtype implements Serializable {
    /**
     * 编号
     */
    private Integer htid;

    /**
     * 名称
     */
    private String htname;

    private static final long serialVersionUID = 1L;

    public Integer getHtid() {
        return htid;
    }

    public void setHtid(Integer htid) {
        this.htid = htid;
    }

    public String getHtname() {
        return htname;
    }

    public void setHtname(String htname) {
        this.htname = htname;
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
        Hangtype other = (Hangtype) that;
        return (this.getHtid() == null ? other.getHtid() == null : this.getHtid().equals(other.getHtid()))
            && (this.getHtname() == null ? other.getHtname() == null : this.getHtname().equals(other.getHtname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHtid() == null) ? 0 : getHtid().hashCode());
        result = prime * result + ((getHtname() == null) ? 0 : getHtname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", htid=").append(htid);
        sb.append(", htname=").append(htname);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}