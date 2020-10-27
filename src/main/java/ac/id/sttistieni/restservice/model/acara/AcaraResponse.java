package ac.id.sttistieni.restservice.model.acara;

import java.util.Date;

public class AcaraResponse {
    Long id;
    String acaraId;
    String acaraTitle;
    String acaraContent;
    String acaraAuthor;
    String location;
    Date startDate;
    Date endDate;
    String thumbnail;
    String category;
    Boolean isShowing;
    Date createdAt;
    Date updatedAt;

    public AcaraResponse(Long id, String acaraId, String acaraTitle, String acaraContent, String acaraAuthor, String location, Date startDate, Date endDate, String thumbnail, String category, Boolean isShowing, Date createdAt, Date updatedAt) {
        this.id = id;
        this.acaraId = acaraId;
        this.acaraTitle = acaraTitle;
        this.acaraContent = acaraContent;
        this.acaraAuthor = acaraAuthor;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.thumbnail = thumbnail;
        this.category = category;
        this.isShowing = isShowing;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAcaraId() {
        return acaraId;
    }

    public void setAcaraId(String acaraId) {
        this.acaraId = acaraId;
    }

    public String getAcaraTitle() {
        return acaraTitle;
    }

    public void setAcaraTitle(String acaraTitle) {
        this.acaraTitle = acaraTitle;
    }

    public String getAcaraContent() {
        return acaraContent;
    }

    public void setAcaraContent(String acaraContent) {
        this.acaraContent = acaraContent;
    }

    public String getAcaraAuthor() {
        return acaraAuthor;
    }

    public void setAcaraAuthor(String acaraAuthor) {
        this.acaraAuthor = acaraAuthor;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getShowing() {
        return isShowing;
    }

    public void setShowing(Boolean showing) {
        isShowing = showing;
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
