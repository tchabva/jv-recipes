package org.northcoders.Entities;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.LAZY;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;

    String name;

    public Category() {
    }

    //TODO Add regular class implements

}
