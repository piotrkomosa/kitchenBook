package org.javastart.homework29.kitchen_book.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "recipes")
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "Description")
    private String description;
    @Column(name = "CookRecipe")
    private String cookRecipe;
    @Column(name = "recipeCategory")
    private Category category;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.PERSIST)
    private Set<Recipe> recipes = new HashSet<>();

    public Recipe() {
    }

    public Recipe(String description, String cookRecipe, Category category) {
        this.description = description;
        this.cookRecipe = cookRecipe;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCookRecipe() {
        return cookRecipe;
    }

    public void setCookRecipe(String cookRecipe) {
        this.cookRecipe = cookRecipe;
    }

    public Category getCathegory() {
        return category;
    }

    public void setCathegory(Category cathegory) {
        this.category = cathegory;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", cookRecipe='" + cookRecipe + '\'' +
                ", cathegory=" + category +
                '}';
    }
}
