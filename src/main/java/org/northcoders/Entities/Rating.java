package org.northcoders.Entities;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;

import java.time.LocalDate;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Check(constraints = "rating_value BETWEEN 1 AND 5")
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "rating_value")
    private int value;

    @Column(name = "date_rated")
    private LocalDate dateRated;

    @OneToOne(mappedBy = "rating")
    private Recipe associatedRecipe;

    @ManyToOne()
    @JoinColumn(name = "rater")
    private User rater;


    public Rating() {
    }

    public Rating(Long id, int value, LocalDate dateRated, Recipe associatedRecipe, User rater) {
        this.id = id;
        this.value = value;
        this.dateRated = dateRated;
        this.associatedRecipe = associatedRecipe;
        this.rater = rater;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LocalDate getDateRated() {
        return dateRated;
    }

    public void setDateRated(LocalDate dateRated) {
        this.dateRated = dateRated;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }

    public User getRater() {
        return rater;
    }

    public void setRater(User rater) {
        this.rater = rater;
    }
}
