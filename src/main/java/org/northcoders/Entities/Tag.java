package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    String name;

    public Tag() {
    }

    //TODO Add regular class implements
}
