package domain;

import java.io.Serializable;

public class Personas implements Serializable {
    private Integer personasid;

    private Integer personaid;

    private static final long serialVersionUID = 1L;

    public Integer getPersonasid() {
        return personasid;
    }

    public void setPersonasid(Integer personasid) {
        this.personasid = personasid;
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
        Personas other = (Personas) that;
        return (this.getPersonasid() == null ? other.getPersonasid() == null : this.getPersonasid().equals(other.getPersonasid()))
            && (this.getPersonaid() == null ? other.getPersonaid() == null : this.getPersonaid().equals(other.getPersonaid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonasid() == null) ? 0 : getPersonasid().hashCode());
        result = prime * result + ((getPersonaid() == null) ? 0 : getPersonaid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personasid=").append(personasid);
        sb.append(", personaid=").append(personaid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}