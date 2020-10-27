package ac.id.sttistieni.restservice.service;

import ac.id.sttistieni.restservice.model.acara.AcaraRequest;
import ac.id.sttistieni.restservice.model.acara.AcaraResponse;

import java.util.List;

public interface AcaraService {
    AcaraResponse save(AcaraRequest acaraRequest);
    AcaraResponse getAcaraById(Long id);
    AcaraResponse update(Long id, AcaraRequest acaraRequest);
    List<AcaraResponse> getAll();
    void deleteAcaraById(Long id);
}
