package org.northcoders.Entities;

import jakarta.persistence.*;
import org.northcoders.Entities.Enums.Role;

import java.util.Set;

@Table(name = "user_account")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String email;

    private String password;


    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Set<Role> roles;

    private String dateRegistered;

    public User() {
    }


}
