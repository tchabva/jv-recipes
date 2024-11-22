package org.northcoders.Entities;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.northcoders.Entities.Enums.Difficulty;

import java.util.Date;
import java.util.List;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    Long id;

    @NotNull
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

    User creator;

    String dateCreated;

    String lastModified;

    public Recipe() {
    }
}
