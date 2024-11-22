package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

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
