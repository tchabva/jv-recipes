package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Ingredient {
    @Id
    @GeneratedValue
    Long id;

    String name;

    int quantity;

    String unitOfMeasurement;

    public Ingredient() {
    }
}
