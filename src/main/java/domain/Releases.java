package domain;

import java.io.Serializable;

public class Releases implements Serializable {
    private Integer releasesid;

    private Integer releaseid;

    private static final long serialVersionUID = 1L;

    public Integer getReleasesid() {
        return releasesid;
    }

    public void setReleasesid(Integer releasesid) {
        this.releasesid = releasesid;
    }

    public Integer getReleaseid() {
        return releaseid;
    }

    public void setReleaseid(Integer releaseid) {
        this.releaseid = releaseid;
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
        Releases other = (Releases) that;
        return (this.getReleasesid() == null ? other.getReleasesid() == null : this.getReleasesid().equals(other.getReleasesid()))
            && (this.getReleaseid() == null ? other.getReleaseid() == null : this.getReleaseid().equals(other.getReleaseid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReleasesid() == null) ? 0 : getReleasesid().hashCode());
        result = prime * result + ((getReleaseid() == null) ? 0 : getReleaseid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", releasesid=").append(releasesid);
        sb.append(", releaseid=").append(releaseid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}