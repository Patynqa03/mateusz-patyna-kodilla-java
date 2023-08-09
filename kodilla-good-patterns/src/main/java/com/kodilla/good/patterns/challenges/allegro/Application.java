package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        BuyRequestRetriever requestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = requestRetriever.retrieve();

        InformationService informationService = new InformationServiceImpl();

        OrderRepository orderRepository = new OrderRepository() {
            @Override
            public void createOrder(User user, Product product) {

            }
        };
        OrderService orderService = new OrderService() {
            @Override
            public boolean order(User user, Product product, LocalDateTime from, LocalDateTime to) {
                return false;
            }
        };


        ProductOrderService productOrderService = new ProductOrderService(informationService,orderRepository,orderService);
        productOrderService.process(buyRequest);
    }

}