package com.kodilla.good.patterns.challenges.door2door;

public class HealthyShop implements Process{
    @Override
    public void processOrder(OrderRequest orderRequest) {
        System.out.println("Zamowionie zlozone z HealthyShop o numerze  " + orderRequest.getOrderId() +
                " czeka na finalizacje aktualny status platnosci to: " + orderRequest.isPaid());
    }
}

