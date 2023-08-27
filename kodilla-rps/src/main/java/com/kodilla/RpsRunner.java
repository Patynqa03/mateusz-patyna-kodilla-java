package com.kodilla;

import com.kodilla.rps.ComputerMove;
import com.kodilla.rps.PlayerMove;

public class RpsRunner {
    public static void main(String[] args) {
        ComputerMove computerMove = new ComputerMove();
        PlayerMove playerMove = new PlayerMove();

        boolean gameOn = false;

        while(!gameOn) {

            if(playerMove.move() == 2) {
                gameOn = true;
            }else {
                playerMove.move();
            }

        }
    }
}