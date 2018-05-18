package repositories;

import model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {

    User findByFirstName(String firstName);

    User findByLastName(String lastName);

}
