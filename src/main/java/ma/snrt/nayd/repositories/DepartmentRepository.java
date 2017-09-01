package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.Department;

public interface DepartmentRepository  extends CrudRepository<Department, Integer>{

}
