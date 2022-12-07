package neo.javadev.projectmanagerapi.mvc.repository;

import neo.javadev.projectmanagerapi.mvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
