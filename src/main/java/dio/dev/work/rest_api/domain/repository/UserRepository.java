package dio.dev.work.rest_api.domain.repository;

import dio.dev.work.rest_api.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByAcount_Number(String number);
}

