package domain;

import java.io.Serializable;

public class Aitem implements Serializable {
    private Integer aitemid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getAitemid() {
        return aitemid;
    }

    public void setAitemid(Integer aitemid) {
        this.aitemid = aitemid;
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
        Aitem other = (Aitem) that;
        return (this.getAitemid() == null ? other.getAitemid() == null : this.getAitemid().equals(other.getAitemid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAitemid() == null) ? 0 : getAitemid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", aitemid=").append(aitemid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}