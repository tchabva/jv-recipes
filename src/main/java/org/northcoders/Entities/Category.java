package org.northcoders.Entities;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Category {
    @Id
    @GeneratedValue
    Long id;

    String name;

    public Category() {
    }
}
