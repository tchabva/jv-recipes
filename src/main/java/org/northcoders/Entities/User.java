package org.northcoders.Entities;

import jakarta.persistence.*;
import org.northcoders.Entities.Enums.Role;

import java.time.LocalDate;
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
    private Role role;

    private LocalDate dateRegistered;

    public User() {
    }

    public User(String username, String email, String password, Role role, LocalDate dateRegistered) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.dateRegistered = dateRegistered;
    }

    public LocalDate getDateRegistered() {
        return dateRegistered;
    }

    public Role getRoles() {
        return role;
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

    public void setRoles(Role roles) {
        this.role = role;
    }

    public void setDateRegistered(LocalDate dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
