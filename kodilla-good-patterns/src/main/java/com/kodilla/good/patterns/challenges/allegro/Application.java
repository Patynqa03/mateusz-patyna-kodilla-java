package com.kodilla.good.patterns.challenges.allegro;
public class Application {
    public static void main(String[] args) {
        BuyRequestRetriever requestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = requestRetriever.retrieve();

        InformationService informationService = new InformationServiceImpl();
        OrderRepository orderRepository = new OrderRepositorylmpl();
        OrderService orderService = new OrderServicelmpl();

        ProductOrderService productOrderService = new ProductOrderService(informationService,orderRepository,orderService);
        productOrderService.process(buyRequest);
    }
}