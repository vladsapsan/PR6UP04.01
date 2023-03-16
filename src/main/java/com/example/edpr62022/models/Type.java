package com.example.edpr62022.models;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;

    @OneToMany (mappedBy = "type", fetch = FetchType.EAGER)
    private Collection<Movie> movie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Collection<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Collection<Movie> movie) {
        this.movie = movie;
    }
}
