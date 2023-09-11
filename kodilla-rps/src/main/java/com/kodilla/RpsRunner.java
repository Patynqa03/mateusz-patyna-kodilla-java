package com.kodilla;

import com.kodilla.rps.ComputerProcessor;
import com.kodilla.rps.GameProcessor;
import com.kodilla.rps.UserMove;
import com.kodilla.rps.UserProcessor;

import java.util.Scanner;



public class RpsRunner {
    public static void main(String[] args) {

        boolean end = false;
        System.out.println("Proszę podaj swoją nazwę");

        Scanner scanner = new Scanner(System.in);
        String imieGracza = scanner.nextLine();

        GameProcessor gameProcessor = new GameProcessor();

        UserProcessor userProcessor = new UserProcessor();
        ComputerProcessor computerProcessor = new ComputerProcessor();



        int liczba = gameProcessor.gameProcess(imieGracza);

        for(int i=0; i<liczba; i++) {
           UserMove userMove = userProcessor.getUserMove();
           if(userMove == UserMove.KONIEC) {
               System.out.println("Kończę grę");
               System.exit(0);
           } else {

           }

        }


    }
    }
