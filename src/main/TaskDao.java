package main;

import org.h2.engine.User;

import java.util.ArrayList;
import java.util.List;

public class TaskDao {
    private List<Task> tasks = new ArrayList<>();

    public TaskDao() {}

    private TaskDao(List<Task> tasks) {
        this.tasks = tasks;
    }

    public boolean create(Task task) {
        if (task != null) {
            System.out.println(task.getTask());
            System.out.println(tasks.size());
            return this.tasks.add(task);
        }

        return false;

    }
}