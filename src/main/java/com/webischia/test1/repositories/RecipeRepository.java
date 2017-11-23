package com.webischia.test1.repositories;

import com.webischia.test1.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {

}
