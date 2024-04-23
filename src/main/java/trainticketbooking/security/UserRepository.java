package trainticketbooking.security;

import org.springframework.data.jpa.repository.JpaRepository;
import trainticketbooking.model.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity>findByUsername(String username);
    Boolean existsByUsername(String username);
}
