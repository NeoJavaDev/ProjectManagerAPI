package neo.javadev.projectmanagerapi.repository;

import neo.javadev.projectmanagerapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
