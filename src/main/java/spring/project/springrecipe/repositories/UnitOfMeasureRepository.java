package spring.project.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.springrecipe.models.UnitOfMeasure;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
