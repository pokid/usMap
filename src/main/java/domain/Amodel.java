package domain;

import java.io.Serializable;

public class Amodel implements Serializable {
    private Integer amodelid;

    private Integer aitemid;

    private static final long serialVersionUID = 1L;

    public Integer getAmodelid() {
        return amodelid;
    }

    public void setAmodelid(Integer amodelid) {
        this.amodelid = amodelid;
    }

    public Integer getAitemid() {
        return aitemid;
    }

    public void setAitemid(Integer aitemid) {
        this.aitemid = aitemid;
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
        Amodel other = (Amodel) that;
        return (this.getAmodelid() == null ? other.getAmodelid() == null : this.getAmodelid().equals(other.getAmodelid()))
            && (this.getAitemid() == null ? other.getAitemid() == null : this.getAitemid().equals(other.getAitemid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAmodelid() == null) ? 0 : getAmodelid().hashCode());
        result = prime * result + ((getAitemid() == null) ? 0 : getAitemid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", amodelid=").append(amodelid);
        sb.append(", aitemid=").append(aitemid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}