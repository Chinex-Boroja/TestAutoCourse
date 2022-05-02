package exercises.demo2;

import java.util.Scanner;

/**
 * Exercise one
 * Create a program that asks the user for a season of the year, then a whole number, them an adjective.
 * Use the input to complete the sentence below the out the result:
 *
 * "On a [adjective][season of the year] day, I drink a minimum of [whole number] cups of coffee."
 */

public class Exercise1 {

    public static void main(String[] args) {

        // Get the season of the year
        System.out.println("Enter the season of the year.");
        Scanner scanner = new Scanner(System.in);
        String seasonOfTheYear = scanner.next();

        // Get the number of times
        System.out.println("Enter a whole number");
        int number = scanner.nextInt();

        // Get an Adjective
        System.out.println("Enter an adjective");
        String adjective = scanner.next();
        scanner.close();

        // Display Result
        System.out.println("On a " + adjective + " " +
                seasonOfTheYear + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
