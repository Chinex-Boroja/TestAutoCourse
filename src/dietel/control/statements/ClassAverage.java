package dietel.control.statements;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        getAverageScore();
    }

    public static void getAverageScore() {
        double total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your grade: ");
            double grade = input.nextDouble();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }

        System.out.println(gradeCounter);
        double average = total / gradeCounter;
        System.out.println(average);
    }
}
