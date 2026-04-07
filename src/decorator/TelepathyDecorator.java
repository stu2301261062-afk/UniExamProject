package decorator;

import factory.Task;
import models.Solution;

public class TelepathyDecorator extends SuperpowerDecorator {
    public TelepathyDecorator(Student student) {
        super(student);
    }

    @Override
    public Solution solve(Task task) {
        Solution originalSolution = wrapper.solve(task);
        return new Solution(getName(), getType(), originalSolution.toString().split("Решение: ")[1] + " [Използва Телепатия, за да прочете ума на асистента]");
    }
}