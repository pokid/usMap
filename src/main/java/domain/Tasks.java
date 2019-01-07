package domain;

import java.io.Serializable;

public class Tasks implements Serializable {
    private Integer tasksid;

    private Integer tmodelid;

    private static final long serialVersionUID = 1L;

    public Integer getTasksid() {
        return tasksid;
    }

    public void setTasksid(Integer tasksid) {
        this.tasksid = tasksid;
    }

    public Integer getTmodelid() {
        return tmodelid;
    }

    public void setTmodelid(Integer tmodelid) {
        this.tmodelid = tmodelid;
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
            && (this.getTmodelid() == null ? other.getTmodelid() == null : this.getTmodelid().equals(other.getTmodelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTasksid() == null) ? 0 : getTasksid().hashCode());
        result = prime * result + ((getTmodelid() == null) ? 0 : getTmodelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tasksid=").append(tasksid);
        sb.append(", tmodelid=").append(tmodelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}