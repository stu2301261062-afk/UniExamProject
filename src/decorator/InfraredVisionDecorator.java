package decorator;

import factory.Task;
import models.Solution;

public class InfraredVisionDecorator extends SuperpowerDecorator {
    public InfraredVisionDecorator(Student student) {
        super(student);
    }

    @Override
    public Solution solve(Task task) {
        Solution originalSolution = wrapper.solve(task);
        return new Solution(getName(), getType(), originalSolution.toString().split("Решение: ")[1] + " [Използва Инфрачервено зрение, за да препише през чина]");
    }
}
