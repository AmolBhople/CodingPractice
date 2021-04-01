package ab.techstack.coding.problems.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GradingStudentsTest {

    @Test
    void gradingStudents() {

        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
//        grades.add();

        List<Integer> finalGrades = new ArrayList<>();
        finalGrades.add(75);
        finalGrades.add(67);
        finalGrades.add(40);
        finalGrades.add(33);

        List<Integer> list = GradingStudents.gradingStudents(grades);

        Assertions.assertArrayEquals(finalGrades.toArray(), list.toArray());

    }

    @Test
    void gradingStudents2() {

        List<Integer> grades = new ArrayList<>();
        grades.add(99);
        grades.add(0);
        grades.add(39);
        grades.add(51);
//        grades.add();

        List<Integer> finalGrades = new ArrayList<>();
        finalGrades.add(100);
        finalGrades.add(0);
        finalGrades.add(40);
        finalGrades.add(51);

        List<Integer> list = GradingStudents.gradingStudents(grades);

        Assertions.assertArrayEquals(finalGrades.toArray(), list.toArray());

    }

    @Test
    void gradingStudents3() {

        List<Integer> grades = new ArrayList<>();

        List<Integer> finalGrades = new ArrayList<>();


        List<Integer> list = GradingStudents.gradingStudents(null);

        Assertions.assertArrayEquals(finalGrades.toArray(), list.toArray());

    }
}