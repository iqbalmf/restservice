package ac.id.sttistieni.restservice.repository;

import ac.id.sttistieni.restservice.entity.UserAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAdminRepository extends JpaRepository<UserAdminEntity, Long> {

}

