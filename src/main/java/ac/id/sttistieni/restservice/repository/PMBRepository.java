package ac.id.sttistieni.restservice.repository;

import ac.id.sttistieni.restservice.entity.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PMBRepository extends JpaRepository<MahasiswaEntity, Long> {

    @Query(value = "select pmb from MahasiswaEntity pmb where pmb.username = :username and pmb.password = :password")
    MahasiswaEntity findByUsername(@Param("username") String loginReq, @Param("password") String pasReq);
}
