package domain;

import java.io.Serializable;

public class Vmodel implements Serializable {
    private Integer vmodelid;

    private Integer versionid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getVmodelid() {
        return vmodelid;
    }

    public void setVmodelid(Integer vmodelid) {
        this.vmodelid = vmodelid;
    }

    public Integer getVersionid() {
        return versionid;
    }

    public void setVersionid(Integer versionid) {
        this.versionid = versionid;
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
        Vmodel other = (Vmodel) that;
        return (this.getVmodelid() == null ? other.getVmodelid() == null : this.getVmodelid().equals(other.getVmodelid()))
            && (this.getVersionid() == null ? other.getVersionid() == null : this.getVersionid().equals(other.getVersionid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVmodelid() == null) ? 0 : getVmodelid().hashCode());
        result = prime * result + ((getVersionid() == null) ? 0 : getVersionid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", vmodelid=").append(vmodelid);
        sb.append(", versionid=").append(versionid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}