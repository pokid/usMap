package domain;

import java.io.Serializable;

public class Titem implements Serializable {
    private Integer titemid;

    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getTitemid() {
        return titemid;
    }

    public void setTitemid(Integer titemid) {
        this.titemid = titemid;
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
        Titem other = (Titem) that;
        return (this.getTitemid() == null ? other.getTitemid() == null : this.getTitemid().equals(other.getTitemid()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTitemid() == null) ? 0 : getTitemid().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", titemid=").append(titemid);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}