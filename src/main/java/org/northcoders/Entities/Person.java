package org.northcoders.Entities;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    Long id;

    String username;

    String email;

    String password;

    String role;

    String dateRegistered;

    public Person() {
    }
}
