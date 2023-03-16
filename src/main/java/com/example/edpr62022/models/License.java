package com.example.edpr62022.models;


import javax.persistence.*;

@Entity
@Table(name = "license")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String license;
    @OneToOne(optional = true, mappedBy = "license")
    private Hunter owner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Hunter getOwner() {
        return owner;
    }

    public void setOwner(Hunter owner) {
        this.owner = owner;
    }
}
