import decorator.*;
import factory.Task;
import models.Solution;
import singleton.University;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        University university = University.getInstance();
        Student nerd = new NerdStudent("Иван");
        Student slick = new SlickStudent("Стоян");
        Student struggler = new StrugglerStudent("Петър");

        nerd = new TelepathyDecorator(nerd);
        slick = new InfraredVisionDecorator(slick);
        struggler = new ForeheadWrinkleDecorator(struggler);

        List<Student> students = List.of(nerd, slick, struggler);

        List<Solution> submittedSolutions = new ArrayList<>();

        for (Student student : students) {
            Task task = university.assignTask(student);
            Solution solution = student.solve(task);
            submittedSolutions.add(solution);

            System.out.println(solution);
            System.out.println("--------------------------------------------------");
        }
        System.out.println("\nРазпределяне на решенията по купчини:\n");
        university.distributeSolutions(submittedSolutions);
    }
}