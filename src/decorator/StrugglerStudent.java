package decorator;

import factory.Task;
import models.Solution;
import models.StudentType;

public class StrugglerStudent implements Student {
    private final String name;

    public StrugglerStudent(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public StudentType getType() { return StudentType.STRUGGLER; }

    @Override
    public Solution solve(Task task) {
        return new Solution(name, getType(), "Преписа каквото можа за '" + task.getTitle() + "' и се прекръсти.");
    }
}