package ac.id.sttistieni.restservice.controller;

import ac.id.sttistieni.restservice.model.WebResponse;
import ac.id.sttistieni.restservice.model.acara.AcaraRequest;
import ac.id.sttistieni.restservice.model.acara.AcaraResponse;
import ac.id.sttistieni.restservice.service.AcaraService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class AcaraController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AcaraController.class);

    @Autowired
    AcaraService acaraDao;

    /*to save an acara*/
    @PostMapping("/acara")
    public WebResponse<AcaraResponse> createAcara(@Valid @RequestBody AcaraRequest acaraEntity) {
        AcaraResponse acaraResponse = acaraDao.save(acaraEntity);
        return new WebResponse<>(200, "CREATED", acaraResponse);
    }

    /*get all acara*/
    @GetMapping("/acara")
    public WebResponse<List<AcaraResponse>> getAllAcara() {
        return new WebResponse<>(200, "OK", acaraDao.getAll());
    }

    /*get acara by id*/
    @GetMapping("/acara/{id}")
    public WebResponse<AcaraResponse> getAcaraById(
            @PathVariable(value = "id")
                    Long id
    ) {
        try {
            AcaraResponse acaraResponse = acaraDao.getAcaraById(id);
            return new WebResponse<>(200, "OK", acaraResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(404, "NOT FOUND", null);
        }
    }

    /*update an acara by id*/
    @PutMapping("/acara/{id}")
    public WebResponse<AcaraResponse> updateAcaraById(
            @PathVariable(value = "id")
                    Long id,
            @Valid @RequestBody AcaraRequest acaraRequest
    ) {
        try {
            AcaraResponse acaraResponse = acaraDao.update(id, acaraRequest);
            return new WebResponse<>(200, "OK", acaraResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(404, "NOT FOUND", null);
        }
    }

    /*delete an acara by id*/
    @DeleteMapping("/acara/{id}")
    public WebResponse<AcaraResponse> deleteAcara(
            @PathVariable(value = "id")
                    Long id
    ) {
        try {
            AcaraResponse acaraResponse = acaraDao.getAcaraById(id);
            acaraDao.deleteAcaraById(id);
            return new WebResponse<>(200, "DELETED", acaraResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(404, e.getMessage(), null);
        }

    }
}
