package ma.snrt.nayd.repositories;

import ma.snrt.nayd.models.SupportDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by nabil on 18/01/2018.
 */
public interface SupportDocsRepository extends JpaRepository<SupportDoc, Integer> {
    List<SupportDoc> findAllByIdSupport(@Param("numsupport") String numSupport);
    List<SupportDoc> findAllByIdCont(@Param("idcoont") Integer idCont);
}
