package ac.id.sttistieni.restservice.repository;

import ac.id.sttistieni.restservice.entity.UserAdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserAdminRepository extends JpaRepository<UserAdminEntity, Long> {
}

