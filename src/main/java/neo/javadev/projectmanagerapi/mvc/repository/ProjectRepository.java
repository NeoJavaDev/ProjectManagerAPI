package neo.javadev.projectmanagerapi.mvc.repository;

import neo.javadev.projectmanagerapi.mvc.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
