package spring.project.springrecipe.services;

import org.springframework.data.repository.CrudRepository;
import spring.project.springrecipe.models.Recipe;

import java.util.Set;

public interface RecipeService  {
    Set<Recipe> getRecipes();
}
