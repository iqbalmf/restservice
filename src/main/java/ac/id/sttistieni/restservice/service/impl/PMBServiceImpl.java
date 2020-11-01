package ac.id.sttistieni.restservice.service.impl;

import ac.id.sttistieni.restservice.entity.MahasiswaEntity;
import ac.id.sttistieni.restservice.model.pmb.PmbLoginReq;
import ac.id.sttistieni.restservice.model.pmb.PmbRequest;
import ac.id.sttistieni.restservice.model.pmb.PmbResponse;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminResponse;
import ac.id.sttistieni.restservice.repository.PMBRepository;
import ac.id.sttistieni.restservice.service.PMBService;
import ac.id.sttistieni.restservice.utils.StringUtils;
import ac.id.sttistieni.restservice.validation.ValidationUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PMBServiceImpl implements PMBService {

    private static final Logger LOGGER = LoggerFactory.getLogger(PMBServiceImpl.class);

    @Autowired
    PMBRepository pmbRepository;
    @Autowired
    ValidationUtil validationUtil;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public PmbResponse registerMhs(PmbRequest pmbRequest) {
        validationUtil.validate(pmbRequest);
        MahasiswaEntity mahasiswaEntity = new MahasiswaEntity();
        mahasiswaEntity.setId_user(StringUtils.getRandomForId());

        mahasiswaEntity.setUsername(pmbRequest.getUsername());

        pmbRequest.setPassword(StringUtils.getRandomString());
        mahasiswaEntity.setPassword(pmbRequest.getPassword());

        mahasiswaEntity.setEmail(pmbRequest.getEmail());
        convert2Entity(mahasiswaEntity, pmbRequest);
        try {
            pmbRepository.save(mahasiswaEntity);
            return conver2Response(mahasiswaEntity, new PmbResponse());
        } catch (RuntimeException e) {
            LOGGER.error("save_pmb: " + e.getMessage());
            return null;
        }
    }

    @Override
    public PmbResponse loginMhs(PmbLoginReq pmbLoginReq) {
        validationUtil.validate(pmbLoginReq);
        MahasiswaEntity mahasiswaEntity = pmbRepository.findByUsername(pmbLoginReq.getUsername(), pmbLoginReq.getPassword());
        if (mahasiswaEntity != null){
            return conver2Response(mahasiswaEntity, new PmbResponse());
        }
        return null;
    }

    @Override
    public PmbResponse getMhsById(Long id) {
        return conver2Response(pmbRepository.getOne(id), new PmbResponse());
    }

    @Override
    public List<PmbResponse> getAllMhs() {
        List<MahasiswaEntity> mahasiswaEntities = new ArrayList<>(pmbRepository.findAll());
        List<PmbResponse> pmbResponses = new ArrayList<>();
        for (MahasiswaEntity mahasiswaEntity: mahasiswaEntities){
            pmbResponses.add(conver2Response(mahasiswaEntity, new PmbResponse()));
        }
        return pmbResponses;
    }

    @Override
    public PmbResponse updateMhs(Long id, PmbRequest pmbRequest) {
        validationUtil.validate(pmbRequest);
        MahasiswaEntity mahasiswaEntity = pmbRepository.getOne(id);
        mahasiswaEntity.setPassword(pmbRequest.getPassword());
        convert2Entity(mahasiswaEntity, pmbRequest);
        pmbRepository.save(mahasiswaEntity);
        return conver2Response(mahasiswaEntity, new PmbResponse());
    }

    @Override
    public void deleteMhsById(Long id) {
        MahasiswaEntity mahasiswaEntity = pmbRepository.getOne(id);
        pmbRepository.delete(mahasiswaEntity);
    }

    private void convert2Entity(MahasiswaEntity mahasiswaEntity, PmbRequest pmbRequest) {
        mahasiswaEntity.setFullname(pmbRequest.getFullname());
        mahasiswaEntity.setKelamin(pmbRequest.getKelamin());
        mahasiswaEntity.setTempatLahir(pmbRequest.getTempatLahir());
        mahasiswaEntity.setTglLahir(pmbRequest.getTglLahir());
        mahasiswaEntity.setIbuKandung(pmbRequest.getIbuKandung());
        mahasiswaEntity.setAlamat(pmbRequest.getAlamat());
        mahasiswaEntity.setKodepos(pmbRequest.getKodepos());
        mahasiswaEntity.setNotlp(pmbRequest.getNotlp());
        mahasiswaEntity.setLulusan(pmbRequest.getLulusan());
        mahasiswaEntity.setAsalLulusan(pmbRequest.getAsalLulusan());
        mahasiswaEntity.setAsalJurusan(pmbRequest.getAsalJurusan());
        mahasiswaEntity.setAsalAlamatLulusan(pmbRequest.getAsalAlamatLulusan());
        mahasiswaEntity.setIsKerja(pmbRequest.getKerja());
        mahasiswaEntity.setKantorInstansi(pmbRequest.getKantorInstansi());
        mahasiswaEntity.setKantorJabatan(pmbRequest.getKantorJabatan());
        mahasiswaEntity.setKantorAlamat(pmbRequest.getKantorAlamat());
        mahasiswaEntity.setKantorNotlp(pmbRequest.getKantorNotlp());
        mahasiswaEntity.setBiayaRencana(pmbRequest.getBiayaRencana());
        mahasiswaEntity.setBiayaSPB(pmbRequest.getBiayaSPB());
        mahasiswaEntity.setBiayaSPP(pmbRequest.getBiayaSPP());
        mahasiswaEntity.setSumberInfo(pmbRequest.getSumberInfo());
        mahasiswaEntity.setpWawancara(pmbRequest.getpWawancara());
        mahasiswaEntity.setPmbJurusan(pmbRequest.getPmbJurusan());
        mahasiswaEntity.setPmbPerguruanTinggi(pmbRequest.getPmbPerguruanTinggi());
        mahasiswaEntity.setIsLunas(pmbRequest.getIsLunas());
    }

    private PmbResponse conver2Response(MahasiswaEntity mahasiswaEntity, PmbResponse pmbResponse) {
        pmbResponse.setId(mahasiswaEntity.getId());
        pmbResponse.setId_user(mahasiswaEntity.getId_user());
        pmbResponse.setUsername(mahasiswaEntity.getUsername());
        pmbResponse.setPassword(mahasiswaEntity.getPassword());
        pmbResponse.setEmail(mahasiswaEntity.getEmail());
        pmbResponse.setFullname(mahasiswaEntity.getFullname());
        pmbResponse.setKelamin(mahasiswaEntity.getKelamin());
        pmbResponse.setTempatLahir(mahasiswaEntity.getTempatLahir());
        pmbResponse.setTglLahir(mahasiswaEntity.getTglLahir());
        pmbResponse.setIbuKandung(mahasiswaEntity.getIbuKandung());
        pmbResponse.setAlamat(mahasiswaEntity.getAlamat());
        pmbResponse.setKodepos(mahasiswaEntity.getKodepos());
        pmbResponse.setNotlp(mahasiswaEntity.getNotlp());
        pmbResponse.setLulusan(mahasiswaEntity.getLulusan());
        pmbResponse.setAsalLulusan(mahasiswaEntity.getAsalLulusan());
        pmbResponse.setAsalJurusan(mahasiswaEntity.getAsalJurusan());
        pmbResponse.setAsalAlamatLulusan(mahasiswaEntity.getAsalAlamatLulusan());
        pmbResponse.setKerja(mahasiswaEntity.getIsKerja());
        pmbResponse.setKantorInstansi(mahasiswaEntity.getKantorInstansi());
        pmbResponse.setKantorJabatan(mahasiswaEntity.getKantorJabatan());
        pmbResponse.setKantorAlamat(mahasiswaEntity.getKantorAlamat());
        pmbResponse.setKantorNotlp(mahasiswaEntity.getKantorNotlp());
        pmbResponse.setBiayaRencana(mahasiswaEntity.getBiayaRencana());
        pmbResponse.setBiayaSPB(mahasiswaEntity.getBiayaSPB());
        pmbResponse.setBiayaSPP(mahasiswaEntity.getBiayaSPP());
        pmbResponse.setSumberInfo(mahasiswaEntity.getSumberInfo());
        pmbResponse.setpWawancara(mahasiswaEntity.getpWawancara());
        pmbResponse.setPmbJurusan(mahasiswaEntity.getPmbJurusan());
        pmbResponse.setPmbPerguruanTinggi(mahasiswaEntity.getPmbPerguruanTinggi());
        pmbResponse.setIsLunas(mahasiswaEntity.getIsLunas());
        return pmbResponse;
    }
}
