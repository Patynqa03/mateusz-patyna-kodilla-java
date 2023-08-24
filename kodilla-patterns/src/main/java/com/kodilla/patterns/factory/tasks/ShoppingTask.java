package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    private String taskName;
    private String where;
    private String using;

    public ShoppingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public String executeTask() {
        return "ZADANIE NIE WYKONANE LODOWKA PUSTA";
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
