package com.kodilla.good.patterns.challenges.allegro;


import java.time.LocalDateTime;

public class BuyRequestRetriever {

    public BuyRequest retrieve() {
        User user = new User("John", "bro@gmail.com");
        Product product = new Product("Sluchawy",1000);

        LocalDateTime rentFrom = LocalDateTime.of(2017, 8, 1, 12, 0);
        LocalDateTime rentTo = LocalDateTime.of(2017, 8, 10, 12, 0);

        return new BuyRequest(user,product, rentFrom, rentTo);
    }

}