package ac.id.sttistieni.restservice.service;

import ac.id.sttistieni.restservice.model.article.ArticleRequest;
import ac.id.sttistieni.restservice.model.article.ArticleResponse;

import java.util.List;

public interface ArticleService {
    ArticleResponse saveArticle(ArticleRequest articleRequest);
    ArticleResponse getArticleById(Long id);
    ArticleResponse updateArticle(Long id, ArticleRequest articleRequest);
    List<ArticleResponse> getAll();
    void deleteArticleById(Long id);
}
