package com.kodilla.good.patterns.challenges.door2door;

public class Application {

    public static void main(String[] args) {
        Order order = new Order();
        OrderRequest orderRequest = order.HealthyShopOrder();
        HealthyShop healthyShop = new HealthyShop();

        healthyShop.processOrder(orderRequest);
    }
}
