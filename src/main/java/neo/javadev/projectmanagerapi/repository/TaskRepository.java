package neo.javadev.projectmanagerapi.repository;

import neo.javadev.projectmanagerapi.entity.Project;
import neo.javadev.projectmanagerapi.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
