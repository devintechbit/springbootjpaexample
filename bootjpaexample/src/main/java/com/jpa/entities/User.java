package com.jpa.entities;

import jakarta.persistence.*;

@Entity
public class User {

    // Generating all required attributes to create table named "test".
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // For Auto-increment...
    private int id;

    @Column
    private String name;

    @Column
    private String city;

    @Column
    private String status;

    // Constructor using fields...
    public User(int id, String name, String city, String status) {
        super();
        this.id = id;
        this.name = name;
        this.city = city;
        this.status = status;
    }

    // Default Constructor...
    public User() {
        super();
    }

    //Generate getters and setters...
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Generate ToString method...

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
