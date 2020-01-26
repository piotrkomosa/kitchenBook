package org.javastart.homework29.kitchen_book.repository;

import org.javastart.homework29.kitchen_book.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe,Long> {

}
