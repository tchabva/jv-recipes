package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    String text;

    String datePosted;

    Person author;

    Recipe associatedRecipe;

    public Comment() {
    }
}
