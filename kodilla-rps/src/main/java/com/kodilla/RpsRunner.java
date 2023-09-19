package com.kodilla;

import com.kodilla.rps.ComputerProcessor;
import com.kodilla.rps.GameProcessor;
import com.kodilla.rps.UserProcessor;

import java.util.Scanner;



public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        int playerScore = 0;
        int computerScore = 0;


        System.out.print("Proszę podaj swoją nazwę ");

        Scanner scanner = new Scanner(System.in);
        String imieGracza = scanner.nextLine();


        try {
            System.out.print("Podaj liczbę wygranych rund do zwycięstwa: ");
            int roundsToWin = scanner.nextInt();
        } catch (Exception o) {
            System.out.println("Prosze wpisz prawidlowy numer");
            scanner.nextInt();
        }



        System.out.println("Instrukcja obsługi gry:");
        System.out.println("k - zagranie kamień");
        System.out.println("p - zagranie papier");
        System.out.println("n - zagranie nożyce");
        System.out.println("x - zakończenie gry");
        System.out.println("r - rozpoczęcie nowej gry");

        GameProcessor gameProcessor = new GameProcessor();

        UserProcessor userProcessor = new UserProcessor();

        ComputerProcessor computerProcessor = new ComputerProcessor();


        while (!end) {
            String userMove = String.valueOf(userProcessor.getUserMove());

            if (userMove.equals("KONIEC")) {
                System.out.println("Czy na pewno chcesz zakończyć grę ? T/N");
                char confirm = scanner.next().charAt(0);
                if (confirm == 'T' || confirm == 't') {
                    end = true;
                }
            }
            else if (userMove.equals("NOWAGRA")) {
                    System.out.print("Czy na pewno zakończyć aktualną grę i rozpocząć nową? T/N: ");
                    char confirmd = scanner.next().charAt(0);
                    if (confirmd == 'T' || confirmd == 't') {
                        playerScore = 0;
                        computerScore = 0;
                        System.out.print("Podaj nową liczbę wygranych rund do zwycięstwa: ");
                        int roundsToWin = scanner.nextInt();
                    }
                }
            }
        }
    }

