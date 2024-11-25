package org.northcoders.Entities;

import jakarta.persistence.*;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @Lob // Lob = Large Object Binary
    private String text;

    @Column(name = "date_posted")
    private String datePosted;

    //You need to specify a join on the "owning side"
    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    @ManyToOne
    @JoinColumn(name = "recipe_id")
    private Recipe associatedRecipe;

    public Comment() {
    }

    public Comment(Recipe associatedRecipe, User author, String datePosted, String text, Long id) {
        this.associatedRecipe = associatedRecipe;
        this.author = author;
        this.datePosted = datePosted;
        this.text = text;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(String datePosted) {
        this.datePosted = datePosted;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Recipe getAssociatedRecipe() {
        return associatedRecipe;
    }

    public void setAssociatedRecipe(Recipe associatedRecipe) {
        this.associatedRecipe = associatedRecipe;
    }
}
