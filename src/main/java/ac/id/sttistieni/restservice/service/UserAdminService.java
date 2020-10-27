package ac.id.sttistieni.restservice.service;

import ac.id.sttistieni.restservice.model.useradmin.UserAdminRequest;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminResponse;

import java.util.List;

public interface UserAdminService {
    UserAdminResponse createUser(UserAdminRequest createUserAdminRequest);

    UserAdminResponse getById(Long id);

    List<UserAdminResponse> getAllUser();

    UserAdminResponse updateUser(Long id, UserAdminRequest userAdminRequest);

    void deleteUserbyId(Long id);
}
