package conditionals;

/*
All sales people get a payment of $1000 a week
Sales people wh exceed 10 sales get an additional bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }
        //output
        System.out.println("The employee's pay is $" + salary);
    }

}
