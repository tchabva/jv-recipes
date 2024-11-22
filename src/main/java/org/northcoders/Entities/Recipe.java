package org.northcoders.Entities;

import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.northcoders.Entities.Enums.Difficulty;

import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

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

//    //@OneToMany
//    Rating rating;

    @OneToMany
    Set<Ingredient> listOfIngredients;

    @OneToMany
    Set<Category> listOfCategories;

    @ManyToOne(fetch = LAZY)
    Person creator;

    String dateCreated;

    String lastModified;

    public Recipe() {
    }
}
