package com.kodilla.spring.portfolio;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BoardTestSuite {
    @Test
    void testTaskAdd() {
        //GIVEN
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //WHEN THEN
        board.getDoneList().getTasks().add("TEST01");
        board.getToDoList().getTasks().add("TEST02");
        board.getInProgressList().getTasks().add("TEST03");

        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getToDoList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
    }
}
