package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.LoanRequest;

public interface LoanRequestRepository  extends CrudRepository<LoanRequest, Long> {

}
