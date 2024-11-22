package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    Long id;

    String name;

    public Tag() {
    }
}
