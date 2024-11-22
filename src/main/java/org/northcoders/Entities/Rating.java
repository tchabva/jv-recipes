package org.northcoders.Entities;

import jakarta.persistence.*;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    int value;

    String dateRated;

    Recipe associatedRecipe;

    Person rater;

    public Rating() {
    }
}
