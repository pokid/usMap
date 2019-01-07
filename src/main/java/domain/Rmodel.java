package domain;

import java.io.Serializable;

public class Rmodel implements Serializable {
    private Integer rmodelid;

    private Integer ritemid;

    private static final long serialVersionUID = 1L;

    public Integer getRmodelid() {
        return rmodelid;
    }

    public void setRmodelid(Integer rmodelid) {
        this.rmodelid = rmodelid;
    }

    public Integer getRitemid() {
        return ritemid;
    }

    public void setRitemid(Integer ritemid) {
        this.ritemid = ritemid;
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
        Rmodel other = (Rmodel) that;
        return (this.getRmodelid() == null ? other.getRmodelid() == null : this.getRmodelid().equals(other.getRmodelid()))
            && (this.getRitemid() == null ? other.getRitemid() == null : this.getRitemid().equals(other.getRitemid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRmodelid() == null) ? 0 : getRmodelid().hashCode());
        result = prime * result + ((getRitemid() == null) ? 0 : getRitemid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rmodelid=").append(rmodelid);
        sb.append(", ritemid=").append(ritemid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}