package domain;

import java.io.Serializable;

public class Tmodel implements Serializable {
    private Integer tmodelid;

    private Integer titemid;

    private static final long serialVersionUID = 1L;

    public Integer getTmodelid() {
        return tmodelid;
    }

    public void setTmodelid(Integer tmodelid) {
        this.tmodelid = tmodelid;
    }

    public Integer getTitemid() {
        return titemid;
    }

    public void setTitemid(Integer titemid) {
        this.titemid = titemid;
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
        Tmodel other = (Tmodel) that;
        return (this.getTmodelid() == null ? other.getTmodelid() == null : this.getTmodelid().equals(other.getTmodelid()))
            && (this.getTitemid() == null ? other.getTitemid() == null : this.getTitemid().equals(other.getTitemid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTmodelid() == null) ? 0 : getTmodelid().hashCode());
        result = prime * result + ((getTitemid() == null) ? 0 : getTitemid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tmodelid=").append(tmodelid);
        sb.append(", titemid=").append(titemid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}