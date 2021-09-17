package spring.project.springrecipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.project.springrecipe.models.Category;
import spring.project.springrecipe.models.Recipe;
import spring.project.springrecipe.models.UnitOfMeasure;
import spring.project.springrecipe.repositories.CategoryRepository;
import spring.project.springrecipe.repositories.RecipeRepository;
import spring.project.springrecipe.repositories.UnitOfMeasureRepository;
import spring.project.springrecipe.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndex(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
