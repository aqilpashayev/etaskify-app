package az.abb.etaskifyapp.repository;

//import az.abb.etaskifyapp.entity.Role;
import az.abb.etaskifyapp.entity.Role;
import az.abb.etaskifyapp.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName (RoleName roleName);
}
