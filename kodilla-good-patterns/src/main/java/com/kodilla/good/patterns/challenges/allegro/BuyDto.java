package com.kodilla.good.patterns.challenges.allegro;



public class BuyDto {

    private User user;
    private boolean isBuyed;

    public BuyDto(final User user, final boolean isRented) {
        this.user = user;
        this.isBuyed = isRented;
    }

    public User getUser() { return user; }

    public boolean isRented() { return isBuyed; }

}