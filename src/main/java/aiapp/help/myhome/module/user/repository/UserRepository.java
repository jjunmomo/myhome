package aiapp.help.myhome.module.user.repository;

import aiapp.help.myhome.module.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
