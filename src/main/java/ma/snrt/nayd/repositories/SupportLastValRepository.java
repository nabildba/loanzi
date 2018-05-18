package ma.snrt.nayd.repositories;

import ma.snrt.nayd.models.SupportLastVal;
import ma.snrt.nayd.views.Support;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by nabil on 22/01/2018.
 */
public interface SupportLastValRepository extends CrudRepository<SupportLastVal,Integer> {
    SupportLastVal findSupportLastValByIdSupportFormatAndAndYear(@Param("suppformat") String suppformat,
                                                                 @Param("year") Integer year);
}
