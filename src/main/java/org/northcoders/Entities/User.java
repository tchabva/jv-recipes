package org.northcoders.Entities;

import jakarta.persistence.*;
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

    String role;

    String dateRegistered;

    public User() {
    }
}
