package decorator;

import factory.Task;
import models.Solution;
import models.StudentType;

public interface Student {
    String getName();
    StudentType getType();
    Solution solve(Task task);
}
