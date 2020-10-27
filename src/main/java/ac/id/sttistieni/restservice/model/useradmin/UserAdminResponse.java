package ac.id.sttistieni.restservice.model.useradmin;

import java.io.Serializable;
import java.util.Date;

public class UserAdminResponse implements Serializable {

    Long id;

    String userId;

    String userName;

    String userPass;

    String userMail;

    String userRole;

    Boolean isActive;

    String userUrl;

    Date createdAt;

    Date updatedAt;

    public UserAdminResponse(Long id, String userId, String userName, String userPass, String userMail, String userRole, Boolean isActive, String userUrl, Date createdAt, Date updatedAt) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userMail = userMail;
        this.userRole = userRole;
        this.isActive = isActive;
        this.userUrl = userUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
