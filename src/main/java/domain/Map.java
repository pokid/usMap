package domain;

import java.io.Serializable;

public class Map implements Serializable {
    private Integer mapid;

    private Integer userid;

    private String mapname;

    private Integer personasid;

    private Integer activitiesid;

    private Integer tasksid;

    private Integer releasesid;

    private static final long serialVersionUID = 1L;

    public Integer getMapid() {
        return mapid;
    }

    public void setMapid(Integer mapid) {
        this.mapid = mapid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getMapname() {
        return mapname;
    }

    public void setMapname(String mapname) {
        this.mapname = mapname == null ? null : mapname.trim();
    }

    public Integer getPersonasid() {
        return personasid;
    }

    public void setPersonasid(Integer personasid) {
        this.personasid = personasid;
    }

    public Integer getActivitiesid() {
        return activitiesid;
    }

    public void setActivitiesid(Integer activitiesid) {
        this.activitiesid = activitiesid;
    }

    public Integer getTasksid() {
        return tasksid;
    }

    public void setTasksid(Integer tasksid) {
        this.tasksid = tasksid;
    }

    public Integer getReleasesid() {
        return releasesid;
    }

    public void setReleasesid(Integer releasesid) {
        this.releasesid = releasesid;
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
        Map other = (Map) that;
        return (this.getMapid() == null ? other.getMapid() == null : this.getMapid().equals(other.getMapid()))
            && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getMapname() == null ? other.getMapname() == null : this.getMapname().equals(other.getMapname()))
            && (this.getPersonasid() == null ? other.getPersonasid() == null : this.getPersonasid().equals(other.getPersonasid()))
            && (this.getActivitiesid() == null ? other.getActivitiesid() == null : this.getActivitiesid().equals(other.getActivitiesid()))
            && (this.getTasksid() == null ? other.getTasksid() == null : this.getTasksid().equals(other.getTasksid()))
            && (this.getReleasesid() == null ? other.getReleasesid() == null : this.getReleasesid().equals(other.getReleasesid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMapid() == null) ? 0 : getMapid().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getMapname() == null) ? 0 : getMapname().hashCode());
        result = prime * result + ((getPersonasid() == null) ? 0 : getPersonasid().hashCode());
        result = prime * result + ((getActivitiesid() == null) ? 0 : getActivitiesid().hashCode());
        result = prime * result + ((getTasksid() == null) ? 0 : getTasksid().hashCode());
        result = prime * result + ((getReleasesid() == null) ? 0 : getReleasesid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mapid=").append(mapid);
        sb.append(", userid=").append(userid);
        sb.append(", mapname=").append(mapname);
        sb.append(", personasid=").append(personasid);
        sb.append(", activitiesid=").append(activitiesid);
        sb.append(", tasksid=").append(tasksid);
        sb.append(", releasesid=").append(releasesid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}