package repositories;

import model.entity.User;
import model.enums.DataStatus;
import org.springframework.data.repository.CrudRepository;

public interface IUserRepository extends CrudRepository<User, Long> {

    User findByFirstName(String firstName);

    User findByLastName(String lastName);

    User findAllByMetadata_Status(DataStatus dataStatus);

}
