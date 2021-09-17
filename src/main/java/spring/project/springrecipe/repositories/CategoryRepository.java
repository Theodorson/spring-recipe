package spring.project.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.springrecipe.models.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
