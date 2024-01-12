package dietel.exercises;

import java.util.Scanner;

/**
 * (Credit Limit Calculator) Develop a Java application that determines whether any of several department-store
 * customers has exceeded the credit limit on a charge account. For each customer, the following facts are available:
 * a) account number
 * b) balance at the beginning of the month
 * c) total of all items charged by the customer this month
 * d) total of all credits applied to the customer’s account this month
 * e) allowed credit limit.
 * The program should input all these facts as integers, calculate the new balance
 * = beginning balance + charges – credits),
 * display the new balance and determine whether the new balance exceeds the customer’s credit limit. For those
 * customers whose credit limit is exceeded, the program should display the message "Credit limit exceeded".
 */

public class CreditLimitCalculator {

    public static void main(String[] args) {

    }

    public static void calculateCreditLimit() {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Please enter your balance at the beginning of this month: ");
        int beginningBalance = input.nextInt();

        System.out.print("Please enter total of all items charged: ");
        int totalItemsCharged = input.nextInt();

        System.out.print("Please enter total of all credits applied: ");
        int totalCreditApplied = input.nextInt();

        System.out.print("Please enter allowed credit limit: ");
        int allowedCreditLimit = input.nextInt();

        System.out.println("Calculating new balance. Please wait........");
        int newBalance = beginningBalance + totalItemsCharged - totalCreditApplied;

        System.out.println("Your new balance is: " + newBalance);

        if (newBalance > allowedCreditLimit) {
            System.out.println("Credit limit  exceeded!!!");
        }

        input.close();
    }
}
