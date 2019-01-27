package domain;

import java.io.Serializable;

public class Tmodel implements Serializable {
    private Integer tmodelid;

    private Integer tasksid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getTmodelid() {
        return tmodelid;
    }

    public void setTmodelid(Integer tmodelid) {
        this.tmodelid = tmodelid;
    }

    public Integer getTasksid() {
        return tasksid;
    }

    public void setTasksid(Integer tasksid) {
        this.tasksid = tasksid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
            && (this.getTasksid() == null ? other.getTasksid() == null : this.getTasksid().equals(other.getTasksid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTmodelid() == null) ? 0 : getTmodelid().hashCode());
        result = prime * result + ((getTasksid() == null) ? 0 : getTasksid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tmodelid=").append(tmodelid);
        sb.append(", tasksid=").append(tasksid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}