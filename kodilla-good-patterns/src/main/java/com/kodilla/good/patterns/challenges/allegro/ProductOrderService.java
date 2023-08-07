package com.kodilla.good.patterns.challenges.allegro;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public ProductOrderService(final InformationService informationService,final OrderRepository orderRepository,final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }


public BuyDto process(final BuyRequest buyRequest) {
        boolean isBought = orderService.order(buyRequest.getUser(),buyRequest.getProduct(),buyRequest.getFrom(),buyRequest.getTo());

        if(isBought) {
        informationService.inform(buyRequest.getUser(),buyRequest.getFrom(),buyRequest.getTo());
        return  new BuyDto(buyRequest.getUser(),true);
        }else {
            return new BuyDto(buyRequest.getUser(), false);
        }
    }

}
