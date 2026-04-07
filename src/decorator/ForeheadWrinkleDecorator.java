package decorator;

import factory.Task;
import models.Solution;

public class ForeheadWrinkleDecorator extends SuperpowerDecorator {
    public ForeheadWrinkleDecorator(Student student) {
        super(student);
    }

    @Override
    public Solution solve(Task task) {
        Solution originalSolution = wrapper.solve(task);
        return new Solution(getName(), getType(), originalSolution.toString().split("Решение: ")[1] + " [Сбръчка чело толкова силно, че предизвика съжаление у квестора]");
    }
}