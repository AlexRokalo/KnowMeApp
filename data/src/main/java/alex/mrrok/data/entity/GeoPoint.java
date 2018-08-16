package alex.mrrok.data.entity;

import com.google.gson.annotations.SerializedName;

import alex.mrrok.data.entity.datamodel.DataModel;

public class GeoPoint implements DataModel {

    @SerializedName("email")
    private String email;

    @SerializedName("latitude")
    private String latitude;

    @SerializedName("longitude")
    private String longitude;

    @SerializedName("online")
    private int online;

    @SerializedName("objectId")
    private String idObject;

    public String getIdObject() {
        return idObject;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }
}
