package domain;

import java.io.Serializable;

public class Activities implements Serializable {
    private Integer activitiesid;

    private Integer mapid;

    private Integer personaid;

    private static final long serialVersionUID = 1L;

    public Integer getActivitiesid() {
        return activitiesid;
    }

    public void setActivitiesid(Integer activitiesid) {
        this.activitiesid = activitiesid;
    }

    public Integer getMapid() {
        return mapid;
    }

    public void setMapid(Integer mapid) {
        this.mapid = mapid;
    }

    public Integer getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Integer personaid) {
        this.personaid = personaid;
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
            && (this.getMapid() == null ? other.getMapid() == null : this.getMapid().equals(other.getMapid()))
            && (this.getPersonaid() == null ? other.getPersonaid() == null : this.getPersonaid().equals(other.getPersonaid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActivitiesid() == null) ? 0 : getActivitiesid().hashCode());
        result = prime * result + ((getMapid() == null) ? 0 : getMapid().hashCode());
        result = prime * result + ((getPersonaid() == null) ? 0 : getPersonaid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", activitiesid=").append(activitiesid);
        sb.append(", mapid=").append(mapid);
        sb.append(", personaid=").append(personaid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}