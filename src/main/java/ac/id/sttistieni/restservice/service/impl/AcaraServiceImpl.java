package ac.id.sttistieni.restservice.service.impl;

import ac.id.sttistieni.restservice.entity.AcaraEntity;
import ac.id.sttistieni.restservice.model.acara.AcaraRequest;
import ac.id.sttistieni.restservice.model.acara.AcaraResponse;
import ac.id.sttistieni.restservice.repository.AcaraRepository;
import ac.id.sttistieni.restservice.service.AcaraService;
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
public class AcaraServiceImpl implements AcaraService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcaraServiceImpl.class);
    @Autowired
    AcaraRepository acaraRepository;
    @Autowired
    ValidationUtil validationUtil;
    @Autowired
    ObjectMapper objectMapper;


    @Override
    public AcaraResponse save(AcaraRequest acaraRequest) {
        validationUtil.validate(acaraRequest);

        AcaraEntity acaraEntity = new AcaraEntity();
        acaraEntity.setAcaraId(acaraRequest.getAcaraId());
        convertToEntity(acaraRequest, acaraEntity);
        try {
            LOGGER.info("save: " + objectMapper.writeValueAsString(acaraEntity));
            acaraRepository.save(acaraEntity);

            return convert2Response(acaraEntity);
        } catch (JsonProcessingException e) {
            LOGGER.error("catch save: " + e.getMessage());
            return null;
        }
    }

    @Override
    public AcaraResponse getAcaraById(Long id) {
        return convert2Response(acaraRepository.getOne(id));
    }

    @Override
    public List<AcaraResponse> getAll() {
        List<AcaraEntity> acaraEntities = new ArrayList<>(acaraRepository.findAll());
        List<AcaraResponse> acaraResponses = new ArrayList<>();
        for (AcaraEntity acaraRespons : acaraEntities) {
            acaraResponses.add(convert2Response(acaraRespons));
        }
        return acaraResponses;
    }

    @Override
    public AcaraResponse update(Long id, AcaraRequest updateAcaraRequest) {
        validationUtil.validate(updateAcaraRequest);

        AcaraEntity acaraEntity = acaraRepository.getOne(id);
        convertToEntity(updateAcaraRequest, acaraEntity);
        acaraEntity.setUpdatedAt(new Date());
        acaraRepository.save(acaraEntity);
        return convert2Response(acaraEntity);
    }


    @Override
    public void deleteAcaraById(Long acaraRequest) {
        AcaraEntity acaraEntity = acaraRepository.getOne(acaraRequest);
        acaraRepository.delete(acaraEntity);
    }

    private AcaraResponse convert2Response(AcaraEntity acaraEntity) {
        return new AcaraResponse(
                acaraEntity.getId(),
                acaraEntity.getAcaraId(),
                acaraEntity.getAcaraTitle(),
                acaraEntity.getAcaraContent(),
                acaraEntity.getAcaraAuthor(),
                acaraEntity.getLocation(),
                acaraEntity.getStartDate(),
                acaraEntity.getEndDate(),
                acaraEntity.getThumbnail(),
                acaraEntity.getCategory(),
                acaraEntity.getShowing(),
                acaraEntity.getCreatedAt(),
                acaraEntity.getUpdatedAt()
        );
    }

    private void convertToEntity(AcaraRequest updateAcaraRequest, AcaraEntity acaraEntity) {
        acaraEntity.setAcaraTitle(updateAcaraRequest.getAcaraTitle());
        acaraEntity.setAcaraAuthor(updateAcaraRequest.getAcaraAuthor());
        acaraEntity.setAcaraContent(updateAcaraRequest.getAcaraContent());
        acaraEntity.setLocation(updateAcaraRequest.getLocation());
        acaraEntity.setStartDate(updateAcaraRequest.getStartDate());
        acaraEntity.setEndDate(updateAcaraRequest.getEndDate());
        acaraEntity.setThumbnail(updateAcaraRequest.getThumbnail());
        acaraEntity.setCategory(updateAcaraRequest.getCategory());
        acaraEntity.setShowing(updateAcaraRequest.getShowing());
    }

}
