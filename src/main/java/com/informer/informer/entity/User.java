package com.informer.informer.entity;

import javax.persistence.*;

@Entity
public class User {

    public User() {}

    public User(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String email;

    public Location getCooedinates() {
        return cooedinates;
    }

    public void setCooedinates(Location cooedinates) {
        this.cooedinates = cooedinates;
    }

    @OneToOne
    private Location cooedinates;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
}

