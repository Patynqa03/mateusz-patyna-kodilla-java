package com.kodilla.rps;

import java.util.Random;

public class ComputerMove implements Move{

    Random random = new Random();
    Paper paper = new Paper();
    Rock rock = new Rock();
    Scissors scissors = new Scissors();

    @Override
    public String move() {
        int move = random.nextInt(3);

        if(move == 0) {
            return rock.getRock();
        }else if (move == 1) {
            return paper.getPaper();
        } else {
            return scissors.getScissors();
        }

    }
}
