package neo.javadev.projectmanagerapi.mvc.repository;

import neo.javadev.projectmanagerapi.mvc.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
