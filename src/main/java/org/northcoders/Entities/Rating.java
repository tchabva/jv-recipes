package org.northcoders.Entities;

import jakarta.persistence.*;
import org.northcoders.Entities.Enums.RatingValue;

import java.util.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    int value;

    String dateRated;

    Recipe associatedRecipe;

    User rater;

    public Rating() {
    }
}
