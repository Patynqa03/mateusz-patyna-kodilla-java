package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {
    private int id;
    private String name;

    public Product() {
    }
    public Product(String name) {
        this.name = name;
    }
@Column(name = "ID",unique = true)
@GeneratedValue
@Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
