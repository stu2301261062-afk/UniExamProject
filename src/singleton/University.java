package singleton;

import chain.GradingPile;
import chain.NerdPile;
import chain.SlickPile;
import chain.StrugglerPile;
import decorator.Student;
import factory.FamiliarTask;
import factory.MisleadingTask;
import factory.ShortTask;
import factory.Task;
import models.Solution;

import java.util.List;

public class University {
    private static University instance;
    private final GradingPile firstPile;

    private University() {
        System.out.println("Университетът отваря врати за големия изпит!\n");
        firstPile = new NerdPile();
        firstPile.setNext(new SlickPile()).setNext(new StrugglerPile());
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }
    public Task assignTask(Student student) {
        switch (student.getType()) {
            case NERD: return new MisleadingTask();
            case SLICK: return new ShortTask();
            case STRUGGLER: return new FamiliarTask();
            default: throw new IllegalArgumentException("Невалиден студент!");
        }
    }
    public void distributeSolutions(List<Solution> solutions) {
        for (Solution sol : solutions) {
            firstPile.collectPaper(sol);
        }
    }
}