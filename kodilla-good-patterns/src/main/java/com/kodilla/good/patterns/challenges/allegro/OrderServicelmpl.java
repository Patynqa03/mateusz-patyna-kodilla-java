package com.kodilla.good.patterns.challenges.allegro;
import java.time.LocalDateTime;
public class OrderServicelmpl implements OrderService{

    LocalDateTime current = LocalDateTime.now();
    @Override
    public boolean order(User user, Product product, LocalDateTime from, LocalDateTime to) {
        if(current.isAfter(to)) {
        return false;

        }else {
            return true;
        }
    }
}
