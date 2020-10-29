package ac.id.sttistieni.restservice.model.article;

import java.io.Serializable;

public class ArticleRequest implements Serializable {
    String articleId;
    String articleTitle;
    String articleAuthor;
    String articleContent;
    String articleThumbnail;
    String articleCategory;
    Boolean isShowing;

    public ArticleRequest(String articleId, String articleTitle, String articleAuthor, String articleContent, String articleThumbnail, String articleCategory, Boolean isShowing) {
        this.articleId = articleId;
        this.articleTitle = articleTitle;
        this.articleAuthor = articleAuthor;
        this.articleContent = articleContent;
        this.articleThumbnail = articleThumbnail;
        this.articleCategory = articleCategory;
        this.isShowing = isShowing;
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
}
