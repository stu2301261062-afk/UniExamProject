package decorator;

import factory.Task;
import models.Solution;
import models.StudentType;

public class SlickStudent implements Student {
    private final String name;

    public SlickStudent(String name) {
        this.name = name;
    }

    @Override public String getName() { return name; }
    @Override public StudentType getType() { return StudentType.SLICK; }

    @Override
    public Solution solve(Task task) {
        return new Solution(name, getType(), "Написа 3 реда гениален код за '" + task.getTitle() + "' и излезе първи.");
    }
}
