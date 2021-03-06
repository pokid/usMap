package domain;

import java.io.Serializable;

public class Tasks implements Serializable {
    private Integer tasksid;

    private Integer mapid;

    private Integer personaid;

    private Integer amodelid;

    private static final long serialVersionUID = 1L;

    public Integer getTasksid() {
        return tasksid;
    }

    public void setTasksid(Integer tasksid) {
        this.tasksid = tasksid;
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
        Tasks other = (Tasks) that;
        return (this.getTasksid() == null ? other.getTasksid() == null : this.getTasksid().equals(other.getTasksid()))
            && (this.getMapid() == null ? other.getMapid() == null : this.getMapid().equals(other.getMapid()))
            && (this.getPersonaid() == null ? other.getPersonaid() == null : this.getPersonaid().equals(other.getPersonaid()))
            && (this.getAmodelid() == null ? other.getAmodelid() == null : this.getAmodelid().equals(other.getAmodelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTasksid() == null) ? 0 : getTasksid().hashCode());
        result = prime * result + ((getMapid() == null) ? 0 : getMapid().hashCode());
        result = prime * result + ((getPersonaid() == null) ? 0 : getPersonaid().hashCode());
        result = prime * result + ((getAmodelid() == null) ? 0 : getAmodelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tasksid=").append(tasksid);
        sb.append(", mapid=").append(mapid);
        sb.append(", personaid=").append(personaid);
        sb.append(", amodelid=").append(amodelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}