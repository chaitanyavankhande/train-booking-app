package trainticketbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import trainticketbooking.model.Roles;


import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Integer> {
    Optional<Roles>findByName(String name);
}
