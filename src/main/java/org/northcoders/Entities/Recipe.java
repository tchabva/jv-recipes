package org.northcoders.Entities;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.northcoders.Entities.Enums.Difficulty;

import java.util.Set;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    Long id;

    String title;

    String description;

    String instructions;

    int preparationTime;

    int cookingTime;

    int servings;

    Difficulty difficultyLevel;

    Rating rating;

    Set<Ingredient> listOfIngredients;

    Set<Category> listOfCategories;

    Person creator;

    String dateCreated;

    String lastModified;

    public Recipe() {
    }
}
