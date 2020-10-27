package ac.id.sttistieni.restservice.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tt_acara")
@EntityListeners(AuditingEntityListener.class)
public class AcaraEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Column(name = "acara_id")
    private String acaraId;

    @NotBlank
    @Column(name = "acara_title")
    private String acaraTitle;

    @NotBlank
    @Column(name = "acara_content")
    private String acaraContent;

    @NotBlank
    @Column(name = "acara_author")
    private String acaraAuthor;

    @NotBlank
    @Column(name = "acara_location")
    private String location;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "acara_date_start")
    private Date startDate;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "acara_date_end")
    private Date endDate;

    @NotBlank
    @Column(name = "acara_thumbnail")
    private String thumbnail;

    @NotBlank
    @Column(name = "acara_category")
    private String category;

    @NotNull
    @Column(name = "is_showing")
    private Boolean isShowing;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "acara_created_tm")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "acara_updated_tm")
    private Date updatedAt;

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
