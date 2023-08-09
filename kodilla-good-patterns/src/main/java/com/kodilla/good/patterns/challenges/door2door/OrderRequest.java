package com.kodilla.good.patterns.challenges.door2door;

public class OrderRequest {

    private String product;
    private int quantity;
    private String orderId;
    private boolean paid;

    public OrderRequest(String product, int quantity, String orderId, boolean paid) {
        this.product = product;
        this.quantity = quantity;
        this.orderId = orderId;
        this.paid = paid;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getOrderId() {
        return orderId;
    }

    public boolean isPaid() {
        return paid;
    }
}
