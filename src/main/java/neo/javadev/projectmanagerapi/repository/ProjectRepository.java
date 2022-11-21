package neo.javadev.projectmanagerapi.repository;

import neo.javadev.projectmanagerapi.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
