package ac.id.sttistieni.restservice.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tt_article")
@EntityListeners(AuditingEntityListener.class)
public class ArticleEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "article_id")
    String articleId;

    @NotBlank
    @Column(name = "article_title")
    String articleTitle;

    @NotBlank
    @Column(name = "article_author")
    String articleAuthor;

    @NotBlank
    @Column(name = "article_content")
    String articleContent;

    @NotBlank
    @Column(name = "article_thumbnail")
    String articleThumbnail;

    @NotBlank
    @Column(name = "article_category")
    String articleCategory;

    @NotNull
    @Column(name = "is_showing")
    Boolean isShowing;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(name = "article_created_tm")
    Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(name = "article_updated_tm")
    Date updatedAt;

    public ArticleEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public String getArticleThumbnail() {
        return articleThumbnail;
    }

    public void setArticleThumbnail(String articleThumbnail) {
        this.articleThumbnail = articleThumbnail;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String artcileCategory) {
        this.articleCategory = artcileCategory;
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
