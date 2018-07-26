package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/*
Created by Joharry 23/07/2018
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);
}
