package org.northcoders.Entities;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

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
