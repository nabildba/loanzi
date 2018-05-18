package ma.snrt.nayd.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ma.snrt.nayd.models.Rubric;

@Repository
public interface RubricRepository extends JpaRepository<Rubric, String> {

}
