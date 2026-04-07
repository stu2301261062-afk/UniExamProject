package chain;

import models.Solution;
import models.StudentType;

public class NerdPile extends GradingPile {
    @Override
    public void collectPaper(Solution solution) {
        if (solution.getStudentType() == StudentType.NERD) {
            System.out.println("РАБОТА ПРИЕТА: Решението на зубрача " + solution.getStudentName() + " е поставено в първата купчина.");
        } else if (nextPile != null) {
            nextPile.collectPaper(solution);
        }
    }
}
