package com.example.edpr62022.models;


import javax.persistence.*;

@Entity
@Table (name = "hunter")
public class Hunter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne(optional = true, cascade = CascadeType.ALL)
    @JoinColumn(name="license_id")
    private License license;

    public Hunter(String name, License license) {
        this.name = name;
        this.license = license;
    }

    public Hunter() {
    }

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

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }
}
