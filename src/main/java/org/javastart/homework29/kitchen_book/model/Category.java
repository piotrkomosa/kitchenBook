package org.javastart.homework29.kitchen_book.model;

import javax.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "OriginCountry")
    private String OriginCountry;

    @ManyToOne
    private Recipe recipe;

    public Category(String originCountry) {
        OriginCountry = originCountry;
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginCountry() {
        return OriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        OriginCountry = originCountry;
    }
}
