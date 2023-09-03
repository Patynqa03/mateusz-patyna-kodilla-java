package com.kodilla.rps;
import java.util.Random;

public class ComputerProcessor {
    public static UserMove computerMove() {
        Random random = new Random();
        int temp = random.nextInt(3) + 1;

        switch (temp) {
            case 1:
                return UserMove.KAMIEN;
            case 2:
                return UserMove.PAPIER;
            case 3:
                return UserMove.NOZYCE;
        }
        return null;
    }
}
