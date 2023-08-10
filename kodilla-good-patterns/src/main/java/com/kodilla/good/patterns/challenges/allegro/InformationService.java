package com.kodilla.good.patterns.challenges.allegro;
import java.time.LocalDateTime;
public interface InformationService {
    public void inform(User user, LocalDateTime from, LocalDateTime to);
}
