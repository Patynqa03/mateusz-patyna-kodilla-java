package com.kodilla.patterns.factory.tasks;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    TaskFactory taskFactory = new TaskFactory();
    @Test
    void DrivingTaskTest() {
        Task drivingTask = taskFactory.checkTask(TaskFactory.drivingTask);

        assertEquals(drivingTask.getTaskName(),"Nauka Jazdy");
    }
    @Test
    void PaintingTaskTest() {
        Task paintingTask = taskFactory.checkTask(TaskFactory.paintingTask);

        assertEquals("Malowane krajobrazu", paintingTask.getTaskName());
    }
    @Test
    void ShoppingTask() {
        Task shoppingTask = taskFactory.checkTask(TaskFactory.shoppingTask);

        assertEquals("Zakupy jedzenia",shoppingTask.getTaskName());
    }
}
