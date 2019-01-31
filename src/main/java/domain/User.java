package domain;

import utils.validate.Login;
import utils.validate.Register;

import javax.validation.GroupSequence;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@GroupSequence({Login.class,User.class})
public class User implements Serializable {

    private Integer userid;

    @NotBlank(groups = {Register.class},message="*请输入昵称")
    @Size(groups = {Register.class},min = 5, max = 15, message = "*昵称长度为5-15位")
    @Pattern(groups = {Register.class},regexp="^[a-zA-Z0-9]+$",message="*昵称由数字、字母或下画线组成")
    private String nickname;

    @NotBlank(groups = {Login.class,Register.class},message="*请输入邮箱")
    @Email(groups = {Login.class,Register.class},message="*请输入正确的邮箱")
    private String email;

    @NotBlank(groups = {Login.class,Register.class},message="*请输入密码")
    @Size(groups = {Login.class,Register.class},min = 6, max = 16, message = "*密码长度为6-16位")
    @Pattern(groups = {Login.class,Register.class},regexp="^[a-zA-Z0-9]+$",message="*密码由数字、字母或下画线组成")
    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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
        User other = (User) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getNickname() == null ? other.getNickname() == null : this.getNickname().equals(other.getNickname()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getNickname() == null) ? 0 : getNickname().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", nickname=").append(nickname);
        sb.append(", email=").append(email);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}