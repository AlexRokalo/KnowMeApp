package alex.mrrok.data.entity;

import com.google.gson.annotations.SerializedName;

public class UsersNews {

    @SerializedName("photo")
    private String photo;

    @SerializedName("title")
    private String title;

    @SerializedName("coments")
    private String coments;

    @SerializedName("email")
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }

    public String getPhoto() {
        return photo;
    }

    public String getTitle() {
        return title;
    }

    public String getComents() {
        return coments;
    }
}
