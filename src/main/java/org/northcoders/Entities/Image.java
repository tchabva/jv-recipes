package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Image {
    @Id
    @GeneratedValue
    Long id;

    String fileName;

    String fileData;

    Recipe asociatedRecipe;

    public Image() {
    }
}
