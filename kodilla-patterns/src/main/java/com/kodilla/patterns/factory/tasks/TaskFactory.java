package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String drivingTask = "drivingTask";
    public final static String shoppingTask = "shoppingTask";
    public final static String paintingTask = "paintingTask";

public final Task checkTask(final String taskName) {
    return switch (taskName) {
        case drivingTask -> new DrivingTask("Nauka Jazdy","Jazdy doszkalające",2);
        case shoppingTask -> new ShoppingTask("Zakupy jedzenia","Galeria","Gotówka");
        case paintingTask ->  new PaintingTask("Malowane krajobrazu","Niebieski","Morze");
        default -> null;
    };

}
}
