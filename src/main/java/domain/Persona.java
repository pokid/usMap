package domain;

import java.io.Serializable;

public class Persona implements Serializable {
    private Integer personaid;

    private Integer personasid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getPersonaid() {
        return personaid;
    }

    public void setPersonaid(Integer personaid) {
        this.personaid = personaid;
    }

    public Integer getPersonasid() {
        return personasid;
    }

    public void setPersonasid(Integer personasid) {
        this.personasid = personasid;
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
        Persona other = (Persona) that;
        return (this.getPersonaid() == null ? other.getPersonaid() == null : this.getPersonaid().equals(other.getPersonaid()))
            && (this.getPersonasid() == null ? other.getPersonasid() == null : this.getPersonasid().equals(other.getPersonasid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPersonaid() == null) ? 0 : getPersonaid().hashCode());
        result = prime * result + ((getPersonasid() == null) ? 0 : getPersonasid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", personaid=").append(personaid);
        sb.append(", personasid=").append(personasid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}