package domain;

import java.io.Serializable;

public class Ritem implements Serializable {
    private Integer ritemid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getRitemid() {
        return ritemid;
    }

    public void setRitemid(Integer ritemid) {
        this.ritemid = ritemid;
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
        Ritem other = (Ritem) that;
        return (this.getRitemid() == null ? other.getRitemid() == null : this.getRitemid().equals(other.getRitemid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRitemid() == null) ? 0 : getRitemid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ritemid=").append(ritemid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}