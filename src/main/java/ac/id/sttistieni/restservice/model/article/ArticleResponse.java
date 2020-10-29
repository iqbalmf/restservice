package ac.id.sttistieni.restservice.model.article;

import java.util.Date;

public class ArticleResponse {
    Long id;
    String articleId;
    String articleTitle;
    String articleAuthor;
    String articleContent;
    String articleThumbnail;
    String articleCategory;
    Boolean isShowing;
    Date createdAt;
    Date updatedAt;

    public ArticleResponse(Long id, String articleId, String articleTitle, String articleAuthor, String articleContent, String articleThumbnail, String artcileCategory, Boolean isShowing, Date createdAt, Date updatedAt) {
        this.id = id;
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleContent = articleContent;
        this.articleThumbnail = articleThumbnail;
        this.articleCategory = artcileCategory;
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
