package domain;

import java.io.Serializable;

public class Personas implements Serializable {
    private Integer personasid;

    private Integer mapid;

    private static final long serialVersionUID = 1L;

    public Integer getPersonasid() {
        return personasid;
    }

    public void setPersonasid(Integer personasid) {
        this.personasid = personasid;
    }

    public Integer getMapid() {
        return mapid;
    }

    public void setMapid(Integer mapid) {
        this.mapid = mapid;
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
        Personas other = (Personas) that;
        return (this.getPersonasid() == null ? other.getPersonasid() == null : this.getPersonasid().equals(other.getPersonasid()))
            && (this.getMapid() == null ? other.getMapid() == null : this.getMapid().equals(other.getMapid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonasid() == null) ? 0 : getPersonasid().hashCode());
        result = prime * result + ((getMapid() == null) ? 0 : getMapid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personasid=").append(personasid);
        sb.append(", mapid=").append(mapid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}