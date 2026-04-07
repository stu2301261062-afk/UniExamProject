package chain;

import models.Solution;
import models.StudentType;

public class SlickPile extends GradingPile {
    @Override
    public void collectPaper(Solution solution) {
        if (solution.getStudentType() == StudentType.SLICK) {
            System.out.println("РАБОТА ПРИЕТА: Решението на тариката " + solution.getStudentName() + " е поставено във втората купчина.");
        } else if (nextPile != null) {
            nextPile.collectPaper(solution);
        }
    }
}
