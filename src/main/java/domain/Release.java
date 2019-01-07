package domain;

import java.io.Serializable;

public class Release implements Serializable {
    private Integer releaseid;

    private Integer rmodelid;

    private static final long serialVersionUID = 1L;

    public Integer getReleaseid() {
        return releaseid;
    }

    public void setReleaseid(Integer releaseid) {
        this.releaseid = releaseid;
    }

    public Integer getRmodelid() {
        return rmodelid;
    }

    public void setRmodelid(Integer rmodelid) {
        this.rmodelid = rmodelid;
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
        Release other = (Release) that;
        return (this.getReleaseid() == null ? other.getReleaseid() == null : this.getReleaseid().equals(other.getReleaseid()))
            && (this.getRmodelid() == null ? other.getRmodelid() == null : this.getRmodelid().equals(other.getRmodelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReleaseid() == null) ? 0 : getReleaseid().hashCode());
        result = prime * result + ((getRmodelid() == null) ? 0 : getRmodelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releaseid=").append(releaseid);
        sb.append(", rmodelid=").append(rmodelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}