package az.abb.etaskifyapp.repository;

import az.abb.etaskifyapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.jws.soap.SOAPBinding;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Boolean findByUsername(String userName);

    User getByUsername(String username);
    //Optional<User> findByUsername(String username);
}
