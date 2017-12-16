package ma.snrt.nayd.repositories;

import ma.snrt.nayd.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by nabil on 04/12/2017.
 */
public interface DocumentRepository extends JpaRepository<Document,Long> {
    @Query("SELECT t FROM Document t where t.materiel like CONCAT('%',:support,'%')  " +
            "OR t.materiel like CONCAT('%',:supportDot,'%') ")
    public List<Document> findAllBySupport(@Param("support") String support,
                                                    @Param("supportDot") String supportDot);
    public List<Document>  findByIdTech(String idtech);
}

