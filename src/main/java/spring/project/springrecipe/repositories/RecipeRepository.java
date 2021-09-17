package spring.project.springrecipe.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.project.springrecipe.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
