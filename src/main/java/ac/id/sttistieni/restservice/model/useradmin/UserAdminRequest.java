package ac.id.sttistieni.restservice.model.useradmin;

import java.io.Serializable;

public class UserAdminRequest implements Serializable {
    String userId;
    String userName;
    String userPass;
    String userMail;
    String userRole;
    Boolean isActive;


    public UserAdminRequest(String userId, String userName, String userPass, String userMail, String userRole, Boolean isActive) {
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userMail = userMail;
        this.userRole = userRole;
        this.isActive = isActive;
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
}

