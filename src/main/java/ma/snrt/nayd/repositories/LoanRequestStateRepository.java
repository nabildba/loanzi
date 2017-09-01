package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;

import ma.snrt.nayd.models.LoanRequestState;


public interface LoanRequestStateRepository  extends CrudRepository<LoanRequestState, Long> {

}
