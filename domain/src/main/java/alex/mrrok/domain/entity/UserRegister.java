package alex.mrrok.domain.entity;

import alex.mrrok.domain.entity.domainmodel.DomainModel;

public class UserRegister implements DomainModel {

    private String password;
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
