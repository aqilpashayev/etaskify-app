package az.abb.etaskifyapp.repository;

import az.abb.etaskifyapp.entity.Role;
import az.abb.etaskifyapp.entity.TaskAssign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskAssignRepository extends JpaRepository<TaskAssign, Long> {
}
