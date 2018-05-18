package ma.snrt.nayd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.SupportType;

public interface SupportTypeRepository  extends JpaRepository<SupportType, Integer> {

}
