package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    String text;

    Date datePosted;

    User author;

    Recipe associatedRecipe;

    public Comment() {
    }
}
