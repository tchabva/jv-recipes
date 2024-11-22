package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Image {
    @Id
    @GeneratedValue
    Long id;

    String fileName;

    String fileData;

    @OneToOne
    Recipe asociatedRecipe;

    public Image() {
    }
}
