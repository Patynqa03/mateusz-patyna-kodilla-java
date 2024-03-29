package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items;

    public Invoice() {
    }

    public Invoice(String number) {
        this.number = number;
    }
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "NUMBER")
    public String getNumber() {
        return number;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "INVOICE",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item2) {
    }
}
