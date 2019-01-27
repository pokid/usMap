package domain;

import java.io.Serializable;

public class Version implements Serializable {
    private Integer versionsid;

    private Integer mapid;

    private Integer amodelid;

    private Integer tmodelid;

    private static final long serialVersionUID = 1L;

    public Integer getVersionsid() {
        return versionsid;
    }

    public void setVersionsid(Integer versionsid) {
        this.versionsid = versionsid;
    }

    public Integer getMapid() {
        return mapid;
    }

    public void setMapid(Integer mapid) {
        this.mapid = mapid;
    }

    public Integer getAmodelid() {
        return amodelid;
    }

    public void setAmodelid(Integer amodelid) {
        this.amodelid = amodelid;
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
        Version other = (Version) that;
        return (this.getVersionsid() == null ? other.getVersionsid() == null : this.getVersionsid().equals(other.getVersionsid()))
            && (this.getMapid() == null ? other.getMapid() == null : this.getMapid().equals(other.getMapid()))
            && (this.getAmodelid() == null ? other.getAmodelid() == null : this.getAmodelid().equals(other.getAmodelid()))
            && (this.getTmodelid() == null ? other.getTmodelid() == null : this.getTmodelid().equals(other.getTmodelid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getVersionsid() == null) ? 0 : getVersionsid().hashCode());
        result = prime * result + ((getMapid() == null) ? 0 : getMapid().hashCode());
        result = prime * result + ((getAmodelid() == null) ? 0 : getAmodelid().hashCode());
        result = prime * result + ((getTmodelid() == null) ? 0 : getTmodelid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", versionsid=").append(versionsid);
        sb.append(", mapid=").append(mapid);
        sb.append(", amodelid=").append(amodelid);
        sb.append(", tmodelid=").append(tmodelid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}