package alex.mrrok.data.entity;

import com.google.gson.annotations.SerializedName;

import alex.mrrok.data.entity.datamodel.DataModel;

public class UserRegistration implements DataModel {

    @SerializedName("password")
    private String password;

    @SerializedName("email")
    private String email;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

}