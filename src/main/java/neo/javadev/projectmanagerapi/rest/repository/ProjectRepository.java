package neo.javadev.projectmanagerapi.rest.repository;

import neo.javadev.projectmanagerapi.rest.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
