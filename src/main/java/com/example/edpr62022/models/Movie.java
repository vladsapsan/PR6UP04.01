package com.example.edpr62022.models;

import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;

@Entity
@Table(name = "Movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne(optional = true, cascade = CascadeType.ALL)
    private Type type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getAddress() {
        return type;
    }

    public void setAddress(Type type) {
        this.type = type;
    }

    public Movie(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public Movie() {
    }
}
