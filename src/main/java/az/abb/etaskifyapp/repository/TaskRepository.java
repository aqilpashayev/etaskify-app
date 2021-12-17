package az.abb.etaskifyapp.repository;

import az.abb.etaskifyapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
