package neo.javadev.projectmanagerapi.rest.repository;

import neo.javadev.projectmanagerapi.rest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
