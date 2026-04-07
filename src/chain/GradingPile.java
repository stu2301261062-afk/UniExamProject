package chain;

import models.Solution;

public abstract class GradingPile {
    protected GradingPile nextPile;

    public GradingPile setNext(GradingPile nextPile) {
        this.nextPile = nextPile;
        return nextPile; // Позволява навързване
    }

    public abstract void collectPaper(Solution solution);
}
