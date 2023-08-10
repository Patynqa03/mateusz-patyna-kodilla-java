package com.kodilla.good.patterns.challenges.allegro;
public class OrderRepositorylmpl implements OrderRepository {
    @Override
    public void createOrder(User user, Product product) {
        System.out.println(user.getUsername() + " " + product.getPrice());
    }
}
