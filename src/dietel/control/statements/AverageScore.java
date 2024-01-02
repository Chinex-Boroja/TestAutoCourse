package dietel.control.statements;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {

        int gradeCounter = 0;
        int totalScore = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade or -1 to quit: ");
        int grade = input.nextInt();

        while (grade != -1) {
            totalScore = totalScore + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter your grade or -1 to quit: ");
            grade = input.nextInt();
        }

        if (gradeCounter != 0) {
            double average = (double) totalScore / gradeCounter;
            System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, totalScore);
            System.out.printf("Class average is %.2f%n ", average);
        }
        else {
            System.out.println("No grades were entered");
        }
    }
}
