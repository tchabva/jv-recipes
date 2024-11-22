package org.northcoders.Entities;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    Integer rating;

    String dateRated;

    @OneToOne
    Recipe associatedRecipe;

    @ManyToOne(fetch=LAZY)
    Person rater;

    public Rating() {
    }
}
