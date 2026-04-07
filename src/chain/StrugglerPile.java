package chain;

import models.Solution;
import models.StudentType;

public class StrugglerPile extends GradingPile {
    @Override
    public void collectPaper(Solution solution) {
        if (solution.getStudentType() == StudentType.STRUGGLER) {
            System.out.println("РАБОТА ПРИЕТА: Решението на калиткото " + solution.getStudentName() + " е поставено в третата купчина.");
        } else if (nextPile != null) {
            nextPile.collectPaper(solution);
        }
    }
}
