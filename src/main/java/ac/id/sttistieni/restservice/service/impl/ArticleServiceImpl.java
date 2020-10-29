package ac.id.sttistieni.restservice.service.impl;

import ac.id.sttistieni.restservice.entity.ArticleEntity;
import ac.id.sttistieni.restservice.model.article.ArticleRequest;
import ac.id.sttistieni.restservice.model.article.ArticleResponse;
import ac.id.sttistieni.restservice.repository.ArticleRepository;
import ac.id.sttistieni.restservice.service.ArticleService;
import ac.id.sttistieni.restservice.validation.ValidationUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;
    @Autowired
    ValidationUtil validationUtil;
    @Autowired
    ObjectMapper objectMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(ArticleServiceImpl.class);


    @Override
    public ArticleResponse saveArticle(ArticleRequest articleRequest) {
        validationUtil.validate(articleRequest);
        ArticleEntity articleEntity = new ArticleEntity();
        convert2Entity(articleRequest, articleEntity);
        try{
            LOGGER.info("save_article: "+objectMapper.writeValueAsString(articleEntity));
            articleRepository.save(articleEntity);
            return convert2Response(articleEntity);
        }catch (JsonProcessingException e){
            LOGGER.error("save_article: "+e.getMessage());
            return null;
        }
    }

    @Override
    public ArticleResponse getArticleById(Long id) {
        return convert2Response(articleRepository.getOne(id));
    }

    @Override
    public ArticleResponse updateArticle(Long id, ArticleRequest articleRequest) {
       validationUtil.validate(articleRequest);
       ArticleEntity articleEntity = articleRepository.getOne(id);
       convert2Entity(articleRequest, articleEntity);
       articleEntity.setUpdatedAt(new Date());
       articleRepository.save(articleEntity);
       return convert2Response(articleEntity);
    }

    @Override
    public List<ArticleResponse> getAll() {
        List<ArticleEntity> articleEntities = new ArrayList<>(articleRepository.findAll());
        List<ArticleResponse> articleResponses = new ArrayList<>();
        for (ArticleEntity articleEntity : articleEntities) {
            articleResponses.add(convert2Response(articleEntity));
        }
        return articleResponses;
    }

    @Override
    public void deleteArticleById(Long id) {
        ArticleEntity articleEntity = articleRepository.getOne(id);
        articleRepository.delete(articleEntity);
    }

    private void convert2Entity(ArticleRequest articleRequest, ArticleEntity articleEntity) {
        articleEntity.setArticleTitle(articleRequest.getArticleTitle());
        articleEntity.setArticleAuthor(articleRequest.getArticleAuthor());
        articleEntity.setArticleContent(articleRequest.getArticleContent());
        articleEntity.setArticleThumbnail(articleRequest.getArticleThumbnail());
        articleEntity.setArticleCategory(articleRequest.getArticleCategory());
        articleEntity.setShowing(articleRequest.getShowing());
    }

    private ArticleResponse convert2Response(ArticleEntity articleEntity) {
        return new ArticleResponse(
                articleEntity.getId(),
                articleEntity.getArticleId(),
                articleEntity.getArticleTitle(),
                articleEntity.getArticleAuthor(),
                articleEntity.getArticleContent(),
                articleEntity.getArticleThumbnail(),
                articleEntity.getArticleCategory(),
                articleEntity.getShowing(),
                articleEntity.getCreatedAt(),
                articleEntity.getUpdatedAt()
        );
    }
}
