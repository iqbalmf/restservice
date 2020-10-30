package ac.id.sttistieni.restservice.repository;

import ac.id.sttistieni.restservice.entity.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PMBRepository extends JpaRepository<MahasiswaEntity, Long> {
}
