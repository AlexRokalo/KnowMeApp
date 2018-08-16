package alex.mrrok.domain.entity;

import alex.mrrok.domain.entity.domainmodel.DomainModel;

public class UserNews implements DomainModel {

    private String photo;
    private String title;
    private String coments;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComents() {
        return coments;
    }

    public void setComents(String coments) {
        this.coments = coments;
    }
}
