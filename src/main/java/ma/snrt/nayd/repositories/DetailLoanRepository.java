package ma.snrt.nayd.repositories;

import ma.snrt.nayd.models.DetailLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface DetailLoanRepository   extends JpaRepository<DetailLoan, Long> {
    DetailLoan findByIdSupport(@Param("numsupport") String numSupport);
}
