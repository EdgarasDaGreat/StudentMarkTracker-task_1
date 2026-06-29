import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final int STUDENT_COUNT = 5;
    static final int MARKS_PER_STUDENT = 5;

    static void fillArray(int[][] marks) {
        Random random = new Random();
        for (int row = 0; row < STUDENT_COUNT; row++) {
            for (int col = 0; col < MARKS_PER_STUDENT; col++ ){
                marks[row][col] = random.nextInt(10)+1;
            }
        }
    }

    static void printArray(int[][] marks) {
        for (int row = 0; row < STUDENT_COUNT; row++) {
            System.out.print("Student " + (row+1) + " results: ");
            for (int col = 0; col < MARKS_PER_STUDENT; col++ ){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
    }

    static List<Double> computeAverages(int[][] marks) {
        List<Double> results = new ArrayList<>();
        for (int row = 0; row < STUDENT_COUNT; row++) {
            double average = 0;
            for (int col = 0; col < MARKS_PER_STUDENT; col++ ){
                average += marks[row][col];
            }
            results.add(average /= MARKS_PER_STUDENT);
        }
        return results;
    }

    static void printResults(List<Double> results) {
        int student = 1;
        for (Double result : results) {
            System.out.println("Student " + student + " results average: " + result);
            student++;
        }
    }

    static void classifyMarks(List<Double> results) {
        for (Double result : results) {
            if (result < 5) {
                System.out.println(result + " FAILED" );
            }
            else if (result >= 5 && result < 7) {
                System.out.println(result + " PASSED: GOOD" );
            }
            else if (result >= 7 && result < 9) {
                System.out.println(result + " PASSED: VERY GOOD" );
            }
            else {
                System.out.println(result + " PASSED: PERFECT" );
            }
        }
    }

    public static void main(String[] args) {
        int [][] marks = new int[STUDENT_COUNT][MARKS_PER_STUDENT];
        fillArray(marks);
        printArray(marks);
        List<Double> results = computeAverages(marks);
        printResults(results);
        classifyMarks(results);
    }
}