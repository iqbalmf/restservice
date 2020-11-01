package ac.id.sttistieni.restservice.controller;

import ac.id.sttistieni.restservice.model.Mail;
import ac.id.sttistieni.restservice.model.WebResponse;
import ac.id.sttistieni.restservice.model.pmb.PmbLoginReq;
import ac.id.sttistieni.restservice.model.pmb.PmbRequest;
import ac.id.sttistieni.restservice.model.pmb.PmbResponse;
import ac.id.sttistieni.restservice.service.MailService;
import ac.id.sttistieni.restservice.service.PMBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/pmb")
public class PMBController {
    @Autowired
    PMBService pmbService;
    @Autowired
    MailService mailService;

    @PostMapping("/register")
    public WebResponse<PmbResponse> registerMhs(@Valid @RequestBody PmbRequest pmbRequest) {
        PmbResponse pmbResponse = pmbService.registerMhs(pmbRequest);
        if (pmbResponse != null){
            Mail mail = new Mail();
            mail.setRecipient(pmbResponse.getEmail());
            mail.setBody(pmbResponse.getPassword());
            mailService.sendEmail(mail);
        }
        return new WebResponse<>(200, "OK", pmbResponse);
    }

    @PostMapping("/login")
    public WebResponse<PmbResponse> loginMhs(@Valid @RequestBody PmbLoginReq username){
        PmbResponse pmbResponse = pmbService.loginMhs(username);
        if (pmbResponse == null){
            return new WebResponse<>(404, "NOT FOUND", null);
        }
        return new WebResponse<>(200, "OK", pmbResponse);
    }

    @GetMapping("/")
    public WebResponse<List<PmbResponse>> getAllMhs() {
        return new WebResponse<>(200, "OK", pmbService.getAllMhs());
    }

    @GetMapping("/mhs/{id}")
    public WebResponse<PmbResponse> getMhsById(@PathVariable(value = "id") Long id) {
        try {
            PmbResponse pmbResponse = pmbService.getMhsById(id);
            return new WebResponse<>(200, "OK", pmbResponse);
        } catch (RuntimeException e) {
            return new WebResponse<>(404, e.getMessage(), null);
        }
    }

    @PutMapping("/mhs/{id}")
    public WebResponse<PmbResponse> updateMhsById(@PathVariable(value = "id") Long id,
                                                  @Valid @RequestBody PmbRequest pmbRequest) {
        try {
            PmbResponse pmbResponse = pmbService.updateMhs(id, pmbRequest);
            return new WebResponse<>(200, "UPDATED", pmbResponse);
        } catch (RuntimeException e) {
            return new WebResponse<>(404, e.getMessage(), null);
        }
    }

    @DeleteMapping("/delete/mhs/{id}")
    public WebResponse<PmbResponse> deleteMhs(
            @PathVariable(value = "id") Long id
    ) {
        try {
            PmbResponse response = pmbService.getMhsById(id);
            pmbService.deleteMhsById(id);
            return new WebResponse<>(200, "DELETED", response);
        } catch (RuntimeException e) {
            return new WebResponse<>(500, e.getMessage(), null);
        }
    }
}
