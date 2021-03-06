package ab.techstack.coding.problems.hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/**
 * https://www.hackerrank.com/challenges/grading/problem
 * HackerLand University has the following grading policy:
 *
 * Every student receives a  in the inclusive range from  to .
 * Any  less than  is a failing grade.
 * Sam is a professor at the university and likes to round each student's  according to these rules:
 *
 * If the difference between the  and the next multiple of  is less than , round  up to the next multiple of .
 * If the value of  is less than , no rounding occurs as the result will still be a failing grade.
 * Examples
 *
 *  round to  (85 - 84 is less than 3)
 *  do not round (result is less than 40)
 *  do not round (60 - 57 is 3 or higher)
 * Given the initial value of  for each of Sam's  students, write code to automate the rounding process.
 *
 * Function Description
 *
 * Complete the function gradingStudents in the editor below.
 *
 * gradingStudents has the following parameter(s):
 *
 * int grades[n]: the grades before rounding
 * Returns
 *
 * int[n]: the grades after rounding as appropriate
 * Input Format
 *
 * The first line contains a single integer, , the number of students.
 * Each line  of the  subsequent lines contains a single integer, .
 *
 * Constraints
 *
 * Sample Input 0
 *
 * 4
 * 73
 * 67
 * 38
 * 33
 * Sample Output 0
 *
 * 75
 * 67
 * 40
 * 33
 * Explanation 0
 *
 * image
 *
 * Student  received a , and the next multiple of  from  is . Since , the student's grade is rounded to .
 * Student  received a , and the next multiple of  from  is . Since , the grade will not be modified and the student's final grade is .
 * Student  received a , and the next multiple of  from  is . Since , the student's grade will be rounded to .
 * Student  received a grade below , so the grade will not be modified and the student's final grade is .
 */

public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrades = new ArrayList<>();
        for (int i = 0; grades !=null && i < grades.size(); i++)  {
            Integer grade = grades.get(i);
            if(grade>=38){
                if(grade%5 >=3){
                    int quo = grade/5;
                    grade = 5*(quo+1);
                }
            }
            finalGrades.add(i, grade);
        }
        return finalGrades;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = GradingStudents.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
