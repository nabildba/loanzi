package ma.snrt.nayd.repositories;

import org.springframework.data.repository.CrudRepository;
import ma.snrt.nayd.models.SupportFormat;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SupportFormatRepository  extends CrudRepository<SupportFormat, String> {
    List<SupportFormat> findAllByActive(@Param("active") Integer active);
}
