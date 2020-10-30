package ac.id.sttistieni.restservice.service;

import ac.id.sttistieni.restservice.model.pmb.PmbLoginReq;
import ac.id.sttistieni.restservice.model.pmb.PmbRequest;
import ac.id.sttistieni.restservice.model.pmb.PmbResponse;

import java.util.List;

public interface PMBService {
    PmbResponse registerMhs(PmbRequest pmbRequest);
    PmbResponse getMhsById(Long id);
    List<PmbResponse> getAllMhs();
    PmbResponse updateMhs(Long id, PmbRequest pmbRequest);
    void deleteMhsById(Long id);

    PmbResponse loginMhs(PmbLoginReq pmbLoginReq);
}
