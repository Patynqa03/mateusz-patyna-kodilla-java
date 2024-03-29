package com.kodilla.good.patterns.challenges.allegro;

import java.time.LocalDateTime;

public interface OrderService {
    public boolean order(User user, Product product, LocalDateTime from, LocalDateTime to);
}
