package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.User;

public interface UserRepository  extends CrudRepository<User, Long>{

}
