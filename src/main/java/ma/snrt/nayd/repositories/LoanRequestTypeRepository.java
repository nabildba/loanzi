package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.LoanRequestType;

public interface LoanRequestTypeRepository  extends CrudRepository<LoanRequestType, Integer> {

}
