package main;

import java.util.ArrayList;
import java.util.List;

public class Task {
    private static int id = 1;
    private String task;
    private String priority;
    private List<Task> tasks = new ArrayList<>();

    public static int getId() {

        return id++;
    }

    public void setTask(String task) {
        this.task = task;
        System.out.print(getId() + " " + task);
    }

    public String getTask() {
        return task;
    }

    public void setPriority(String priority) {
        this.priority = priority;
        System.out.print(" " + priority + "\n");
    }

    public String getPriority() {

        return priority;
    }
}