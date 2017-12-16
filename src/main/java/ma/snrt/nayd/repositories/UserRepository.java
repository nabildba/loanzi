package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
    public User findByEmail(String email);
}
