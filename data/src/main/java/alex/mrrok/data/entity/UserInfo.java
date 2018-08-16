package alex.mrrok.data.entity;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import alex.mrrok.data.entity.datamodel.DataModel;

@Entity(tableName = UserInfo.TABLE_NAME)
public class UserInfo implements DataModel {

    public static final String TABLE_NAME = "UserInfoDbEntity";

    @SerializedName("phone")
    private String phone;

    @SerializedName("photo")
    private String photo;

    @SerializedName("email")
    @PrimaryKey
    @NonNull
    private String email;

    @SerializedName("userInfo")
    private String userInfo;

    @SerializedName("name")
    private String name;

    @SerializedName("nickname")
    private String nickname;

    @SerializedName("objectId")
    private String idObject;

    public String getIdObject() {
        return idObject;
    }

    public void setIdObject(String idObject) {
        this.idObject = idObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }
}
