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
    @Query("SELECT t FROM Document t where t.materiel like CONCAT('%',:support,'%')  ")
            //+ " or exists (select sd from SupportDoc sd where sd.idCont=t.idCont and sd.idSupport=:support)")
    List<Document> findAllBySupport(@Param("support") String support);
    @Query("SELECT t FROM Document t where t.materiel like CONCAT('%',:support,'%') or " +
            "t.materiel like CONCAT('%',:supportDot,'%')")
        //+ " or exists (select sd from SupportDoc sd where sd.idCont=t.idCont and sd.idSupport=:support)")
    List<Document> findAllBySupport(@Param("support") String support,@Param("supportDot") String supportDot);
    Document findDocumentByIdTech(@Param("techid") String techid);

//    @Query("SELECT t FROM Document t where t.materiel like CONCAT('%',:support,'%')  " +
//            "OR t.materiel like CONCAT('%',:supportDot,'%') ")
//    public Document findOneBySupport(@Param("support") String support,
//                                                    @Param("supportDot") String supportDot);
}

