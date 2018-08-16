package alex.mrrok.data.entity;

import com.google.gson.annotations.SerializedName;

public class HttpError extends Exception {
    @SerializedName("code")
    private String code;

    @SerializedName("message")
    private String message;

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
