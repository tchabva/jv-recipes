package org.northcoders.Entities;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue
    Long id;

    String text;

    String datePosted;

    @ManyToOne
    Person author;

    @OneToOne
    Recipe associatedRecipe;

    public Comment() {
    }
}
