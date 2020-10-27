package ac.id.sttistieni.restservice.service.impl;


import ac.id.sttistieni.restservice.entity.UserAdminEntity;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminRequest;
import ac.id.sttistieni.restservice.model.useradmin.UserAdminResponse;
import ac.id.sttistieni.restservice.repository.UserAdminRepository;
import ac.id.sttistieni.restservice.service.UserAdminService;
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
public class UserAdminServiceImpl implements UserAdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAdminServiceImpl.class);

    @Autowired
    UserAdminRepository userAdminRepository;
    @Autowired
    ValidationUtil validationUtil;
    @Autowired
    ObjectMapper objectMapper;

    @Override
    public UserAdminResponse createUser(UserAdminRequest createUserAdminRequest) {
        validationUtil.validate(createUserAdminRequest);
        UserAdminEntity userAdminEntity = new UserAdminEntity();
        userAdminEntity.setUserId(createUserAdminRequest.getUserId());
        convert2Entity(createUserAdminRequest, userAdminEntity);
        try {
            LOGGER.info("save_user: " + objectMapper.writeValueAsString(userAdminEntity));
            userAdminRepository.save(userAdminEntity);
            return convert2Response(userAdminEntity);
        } catch (JsonProcessingException e) {
            LOGGER.error("save_user: " + e.getMessage());
            return null;
        }
    }

    @Override
    public UserAdminResponse getById(Long id) {
        return convert2Response(userAdminRepository.getOne(id));
    }

    @Override
    public List<UserAdminResponse> getAllUser() {
        List<UserAdminEntity> userAdminEntities = new ArrayList<>(userAdminRepository.findAll());
        List<UserAdminResponse> adminResponses = new ArrayList<>();
        for (UserAdminEntity userAdminEntity : userAdminEntities) {
            adminResponses.add(convert2Response(userAdminEntity));
        }
        return adminResponses;
    }

    @Override
    public UserAdminResponse updateUser(Long id, UserAdminRequest userAdminRequest) {
        validationUtil.validate(userAdminRequest);

        UserAdminEntity userAdminEntity = userAdminRepository.getOne(id);
        convert2Entity(userAdminRequest, userAdminEntity);
        userAdminEntity.setUpdatedAt(new Date());
        userAdminRepository.save(userAdminEntity);
        return convert2Response(userAdminEntity);
    }

    @Override
    public void deleteUserbyId(Long id) {
        UserAdminEntity userAdminEntity = userAdminRepository.getOne(id);
        userAdminRepository.delete(userAdminEntity);
    }

    private void convert2Entity(UserAdminRequest userAdminRequest, UserAdminEntity userAdminEntity) {
        userAdminEntity.setUserName(userAdminRequest.getUserName());
        userAdminEntity.setUserPass(userAdminRequest.getUserPass());
        userAdminEntity.setUserMail(userAdminRequest.getUserMail());
        userAdminEntity.setUserRole(userAdminRequest.getUserRole());
        userAdminEntity.setActive(userAdminRequest.getActive());
    }

    private UserAdminResponse convert2Response(UserAdminEntity userAdminEntity) {
        return new UserAdminResponse(
                userAdminEntity.getId(),
                userAdminEntity.getUserId(),
                userAdminEntity.getUserName(),
                userAdminEntity.getUserPass(),
                userAdminEntity.getUserMail(),
                userAdminEntity.getUserRole(),
                userAdminEntity.getActive(),
                userAdminEntity.getUserUrl(),
                userAdminEntity.getCreatedAt(),
                userAdminEntity.getUpdatedAt()
        );
    }
}
