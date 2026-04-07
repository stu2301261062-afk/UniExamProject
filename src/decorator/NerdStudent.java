package decorator;

import factory.Task;
import models.Solution;
import models.StudentType;

public class NerdStudent implements Student {
    private final String name;

    public NerdStudent(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public StudentType getType() { return StudentType.NERD; }

    @Override
    public Solution solve(Task task) {
        return new Solution(name, getType(), "Написа 10 страници подробни доказателства за '" + task.getTitle() + "'.");
    }
}
