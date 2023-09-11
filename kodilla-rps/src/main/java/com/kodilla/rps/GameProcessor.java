package com.kodilla.rps;

import java.util.Scanner;

public class GameProcessor {

    public int gameProcess (String imieGracza) {

        int liczbaRund = 0;
        boolean temp = true;
        while (temp) {

            Scanner scanner = new Scanner(System.in);
            try {

                System.out.println(imieGracza + " Prosze napisz ile rund chcesz zagrac");
                liczbaRund = scanner.nextInt();
                temp = false;
            } catch (Exception e) {
                System.out.println("Proszę wpisać poprawną liczbę rund... ");
                scanner.nextLine();
            }
        }

        return liczbaRund;
    }
}
