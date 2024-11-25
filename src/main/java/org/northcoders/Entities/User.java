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

    public User(String username, String email, String password, Set<Role> roles, String dateRegistered) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.dateRegistered = dateRegistered;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
