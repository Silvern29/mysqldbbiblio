package at.redlinghaus.repository;

import at.redlinghaus.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
