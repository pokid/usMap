package domain;

import java.io.Serializable;

public class Activities implements Serializable {
    private Integer activitiesid;

    private Integer amodelid;

    private static final long serialVersionUID = 1L;

    public Integer getActivitiesid() {
        return activitiesid;
    }

    public void setActivitiesid(Integer activitiesid) {
        this.activitiesid = activitiesid;
    }

    public Integer getAmodelid() {
        return amodelid;
    }

    public void setAmodelid(Integer amodelid) {
        this.amodelid = amodelid;
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
        Activities other = (Activities) that;
        return (this.getActivitiesid() == null ? other.getActivitiesid() == null : this.getActivitiesid().equals(other.getActivitiesid()))
            && (this.getAmodelid() == null ? other.getAmodelid() == null : this.getAmodelid().equals(other.getAmodelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivitiesid() == null) ? 0 : getActivitiesid().hashCode());
        result = prime * result + ((getAmodelid() == null) ? 0 : getAmodelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activitiesid=").append(activitiesid);
        sb.append(", amodelid=").append(amodelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}