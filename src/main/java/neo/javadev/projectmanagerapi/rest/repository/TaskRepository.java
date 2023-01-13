package neo.javadev.projectmanagerapi.rest.repository;

import neo.javadev.projectmanagerapi.rest.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
