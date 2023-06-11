package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5,(a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Niebieska trawa",text -> text.toUpperCase());
        poemBeautifier.beautify("Zielona trawa",text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("Fioletowa trawa",text -> text + " Napisane przez ogrodnika");
        poemBeautifier.beautify("AnYzOwA tRAwA",text -> text.toLowerCase());

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(25);

    }

}