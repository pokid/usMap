package domain;

import java.io.Serializable;

public class Amodel implements Serializable {
    private Integer amodelid;

    private Integer activitiesid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getAmodelid() {
        return amodelid;
    }

    public void setAmodelid(Integer amodelid) {
        this.amodelid = amodelid;
    }

    public Integer getActivitiesid() {
        return activitiesid;
    }

    public void setActivitiesid(Integer activitiesid) {
        this.activitiesid = activitiesid;
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
        Amodel other = (Amodel) that;
        return (this.getAmodelid() == null ? other.getAmodelid() == null : this.getAmodelid().equals(other.getAmodelid()))
            && (this.getActivitiesid() == null ? other.getActivitiesid() == null : this.getActivitiesid().equals(other.getActivitiesid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAmodelid() == null) ? 0 : getAmodelid().hashCode());
        result = prime * result + ((getActivitiesid() == null) ? 0 : getActivitiesid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", amodelid=").append(amodelid);
        sb.append(", activitiesid=").append(activitiesid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}