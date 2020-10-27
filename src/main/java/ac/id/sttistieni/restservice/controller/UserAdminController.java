package ac.id.sttistieni.restservice.controller;


import ac.id.sttistieni.restservice.model.WebResponse;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminRequest;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminResponse;
import ac.id.sttistieni.restservice.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.net.HttpURLConnection;
import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserAdminController {

    @Autowired
    UserAdminService userAdminService;

    @PostMapping(
            value = "/userAdmin",
            produces = "application/json",
            consumes = "application/json"
    )
    public WebResponse<UserAdminResponse> createUserAdmin(@Valid @RequestBody UserAdminRequest body) {
        UserAdminResponse adminResponse = userAdminService.createUser(body);
        return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", adminResponse);
    }

    @GetMapping(
            value = "/userAdmin/{id}",
            produces = "application/json"
    )
    public WebResponse<UserAdminResponse> getUserAdmin(@PathVariable("id") Long idUser) {
        try {
            UserAdminResponse userAdminResponse = userAdminService.getById(idUser);
            return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", userAdminResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_NOT_FOUND, "NOT FOUND", null);
        }
    }

    @GetMapping(
            value = "/userAdmin",
            produces = "application/json"
    )
    public WebResponse<List<UserAdminResponse>> getAllUser() {
        return new WebResponse<>(HttpURLConnection.HTTP_OK, "OK", userAdminService.getAllUser());
    }

    @DeleteMapping("/userAdmin/{id}")
    public WebResponse<UserAdminResponse> deleteUserbyId(
            @PathVariable(value = "id")
                    Long id
    ) {
        try {
            UserAdminResponse userAdminResponse = userAdminService.getById(id);
            userAdminService.deleteUserbyId(id);
            return new WebResponse<>(HttpURLConnection.HTTP_OK, "DELETED", userAdminResponse);
        } catch (EntityNotFoundException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_NOT_FOUND, e.getMessage(), null);
        } catch (RuntimeException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_INTERNAL_ERROR, e.getMessage(), null);
        }
    }

    @PutMapping("/userAdmin/{id}")
    public WebResponse<UserAdminResponse> updateUserById(
            @PathVariable(value = "id") Long id,
            @Valid @RequestBody UserAdminRequest body
    ) {
        try {
            UserAdminResponse userAdminResponse = userAdminService.updateUser(id, body);
            return new WebResponse<>(HttpURLConnection.HTTP_OK, "UPDATED", userAdminResponse);
        } catch (RuntimeException e) {
            return new WebResponse<>(HttpURLConnection.HTTP_INTERNAL_ERROR, e.getMessage(), null);
        }
    }

}
