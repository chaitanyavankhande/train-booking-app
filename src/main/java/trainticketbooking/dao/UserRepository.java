package trainticketbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import trainticketbooking.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>{
    Optional<User>findByUsername(String username);
    Boolean existsByUsername(String username);
}

