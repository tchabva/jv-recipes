package org.northcoders.Entities;

import jakarta.persistence.*;

@Entity
public class Image {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Lob
    @Column(name = "file_data")
    byte[] fileData;

    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe asociatedRecipe;

    public Image() {
    }

    public Image(Long id, String fileName, byte[] fileData, Recipe asociatedRecipe) {
        this.id = id;
        this.fileName = fileName;
        this.fileData = fileData;
        this.asociatedRecipe = asociatedRecipe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFileData() {
        return fileData;
    }

    public void setFileData(byte[] fileData) {
        this.fileData = fileData;
    }

    public Recipe getAsociatedRecipe() {
        return asociatedRecipe;
    }

    public void setAsociatedRecipe(Recipe asociatedRecipe) {
        this.asociatedRecipe = asociatedRecipe;
    }
}
