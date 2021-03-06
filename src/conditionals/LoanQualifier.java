package conditionals;

import java.util.Scanner;

/*
NEXTED IFS:
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years
 */
public class LoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        System.out.println("Enter your salary");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextInt();

        System.out.println("Enter the number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requiredSalary) {
            if (years >= requiredYearsEmployed) {
                System.out.println("Congrats! You qualify for the loan");
            }
            else {
                System.out.println("Sorry, you must have worked at your current job "
                        + requiredYearsEmployed + " year");
            }
        }
        else {
            System.out.println("Sorry, you must earn at least "
                    + requiredSalary + " to qualify for the loan");
        }
    }
}
