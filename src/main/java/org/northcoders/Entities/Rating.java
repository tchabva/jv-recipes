package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.northcoders.Entities.Enums.RatingValue;

import java.util.Date;

@Entity
public class Rating {
    @Id
    @GeneratedValue
    Long id;

    RatingValue value;

    Date dateRated;

    Recipe associatedRecipe;

    User rater;

    public Rating() {
    }
}
