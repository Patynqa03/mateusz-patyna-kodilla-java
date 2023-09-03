package com.kodilla.rps;

import java.util.Scanner;

public class UserProcessor {
    public static UserMove getUserMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Prosze wybierz swój ruch: P - Papier, N - Nozyce, K - Kamien");
            String temp = scanner.nextLine().toUpperCase();
            switch (temp) {
                case "P" : return UserMove.PAPIER;
                case "N" : return UserMove.NOZYCE;
                case "K" : return UserMove.KAMIEN;
                case "X" : return UserMove.KONIEC;
                case "R" : return UserMove.NOWAGRA;
                default:
                    System.out.println("Prosze wybrać poprawną opcje.");
            }
        }
    }
}


