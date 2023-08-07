package com.kodilla.good.patterns.challenges.allegro;

import com.kodilla.good.patterns.challenges.allegro.User;

import java.time.LocalDateTime;

public class BuyRequest {

    private Product product;
    private User user;
    private LocalDateTime from;
    private LocalDateTime to;

    public BuyRequest(final User user,final Product product, final LocalDateTime from, final LocalDateTime to) {
        this.user = user;
        this.product = product;
        this.from = from;
        this.to = to;
    }

    public Product getProduct() { return product; }
    public User getUser() { return user; }

    public LocalDateTime getFrom() { return from; }

    public LocalDateTime getTo() { return to; }
}