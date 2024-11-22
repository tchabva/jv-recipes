package org.northcoders.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.northcoders.Entities.Enums.Role;

import java.util.Date;

@Entity
public class User {
    @Id
    @GeneratedValue
    Long id;

    String username;

    String email;

    String password;

    Role role;

    Date date;

    public User() {
    }
}
