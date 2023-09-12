package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;

import java.math.BigDecimal;

public class Item {
    private int id;
    private BigDecimal price;
    private int quantity;
    private BigDecimal value;
    private Product product;

    public Item() {
    }

    public Item(Product product, BigDecimal price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.value = price.multiply(BigDecimal.valueOf(quantity));
    }
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }

    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
