package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.northcoders.Entities.Enums.Difficulty;

import java.util.Date;
import java.util.List;

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

    List<Ingredient> listOfIngredients;

    List<Category> listOfCategories;

    User creator;

    Date dateCreated;

    Date lastModified;

    public Recipe() {
    }
}
