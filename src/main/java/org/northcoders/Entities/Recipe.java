package org.northcoders.Entities;

import jakarta.persistence.*;
import org.northcoders.Entities.Enums.Difficulty;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    @Lob
    private String instructions;

    @Column(name = "preparation_time")
    private int preparationTime;

    @Column(name = "cooking_time")
    private int cookingTime;

    private int servings;

    @Column(name = "difficulty_level")
    private Difficulty difficultyLevel;

    /*
    Due to unclear nature of the task, we have assumed that this is a one-to-one relationship
     */
    @OneToOne
    @JoinColumn(name = "rating_id")
    private Rating rating;

    // This is only required on the owning side of the relationship
    @ManyToMany
    @JoinTable(
            name = "recipe_ingredient",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> listOfIngredients;


    @ManyToMany
    @JoinTable(
            name = "recipe_category",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> listOfCategories;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    @Column(name = "date_created")
    private LocalDate dateCreated;

    @Column(name = "date_modified")
    private LocalDate lastModified;

    public Recipe() {
    }

    public Recipe(Long id, String title, String description, String instructions, int preparationTime, int cookingTime, int servings, Difficulty difficultyLevel, Rating rating, List<Ingredient> listOfIngredients, List<Category> listOfCategories, User creator, LocalDate dateCreated) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.instructions = instructions;
        this.preparationTime = preparationTime;
        this.cookingTime = cookingTime;
        this.servings = servings;
        this.difficultyLevel = difficultyLevel;
        this.rating = rating;
        this.listOfIngredients = listOfIngredients;
        this.listOfCategories = listOfCategories;
        this.creator = creator;
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public int getServings() {
        return servings;
    }

    public Difficulty getDifficultyLevel() {
        return difficultyLevel;
    }

    public Rating getRating() {
        return rating;
    }

    public List<Ingredient> getListOfIngredients() {
        return listOfIngredients;
    }

    public List<Category> getListOfCategories() {
        return listOfCategories;
    }

    public User getCreator() {
        return creator;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public LocalDate getLastModified() {
        return lastModified;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setPreparationTime(int preparationTime) {
        this.preparationTime = preparationTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setDifficultyLevel(Difficulty difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setListOfIngredients(List<Ingredient> listOfIngredients) {
        this.listOfIngredients = listOfIngredients;
    }

    public void setListOfCategories(List<Category> listOfCategories) {
        this.listOfCategories = listOfCategories;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public void setLastModified(LocalDate lastModified) {
        this.lastModified = lastModified;
    }
}
