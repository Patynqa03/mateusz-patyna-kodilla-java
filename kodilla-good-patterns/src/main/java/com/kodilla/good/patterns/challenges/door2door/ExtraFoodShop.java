package com.kodilla.good.patterns.challenges.door2door;

public class ExtraFoodShop implements Process{
    @Override
    public void processOrder(OrderRequest orderRequest) {
        System.out.println("Zamowionie zlozone z ExtraFoodShop na " + orderRequest.getProduct() + " w ilosci " + orderRequest.getQuantity());
    }
}
