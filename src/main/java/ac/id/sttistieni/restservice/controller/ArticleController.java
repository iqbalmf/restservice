package ac.id.sttistieni.restservice.controller;

import ac.id.sttistieni.restservice.model.WebResponse;
import ac.id.sttistieni.restservice.model.article.ArticleRequest;
import ac.id.sttistieni.restservice.model.article.ArticleResponse;
import ac.id.sttistieni.restservice.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.net.HttpURLConnection;
import java.util.List;

@RestController
@RequestMapping("api/v1/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @PostMapping("/")
    public WebResponse<ArticleResponse> createArticle(@Valid @RequestBody ArticleRequest articleRequest) {
        ArticleResponse articleResponse = articleService.saveArticle(articleRequest);
        return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", articleResponse);
    }

    @GetMapping("/{id}")
    public WebResponse<ArticleResponse> getArticleById(@PathVariable("id") Long id) {
        ArticleResponse articleResponse = articleService.getArticleById(id);
        return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", articleResponse);
    }

    @GetMapping("/")
    public WebResponse<List<ArticleResponse>> getArticles() {
        List<ArticleResponse> articleResponse = articleService.getAll();
        return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", articleResponse);
    }

    @PutMapping("/{id}")
    public WebResponse<ArticleResponse> updateArticles(@PathVariable(value = "id") Long id, @Valid @RequestBody ArticleRequest articleRequest) {
        try {
            ArticleResponse articleResponse = articleService.updateArticle(id, articleRequest);
            return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", articleResponse);
        } catch (RuntimeException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_NOT_FOUND, e.getMessage(), null);
        }
    }

    @DeleteMapping("/{id}")
    public WebResponse<ArticleResponse> deleteArticle(@PathVariable("id") Long id) {
        try {
            ArticleResponse articleResponse = articleService.getArticleById(id);
            articleService.deleteArticleById(id);
            return new WebResponse<>(HttpURLConnection.HTTP_OK, "DELETED", articleResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_NOT_FOUND, e.getMessage(), null);
        } catch (RuntimeException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_INTERNAL_ERROR, e.getMessage(), null);
        }
    }
}
