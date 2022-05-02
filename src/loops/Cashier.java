package loops;

import java.util.Scanner;
/*
 *
 * FOR LOOP
 * Write a cashier program that will scan a given number of items and tally the cost
 */
public class Cashier {

    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan: ");
        Scanner input = new Scanner(System.in);

        int quantity = input.nextInt();

        double total = 0;
        //Create a loop to iterate over the item
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the cost of the item:");
            double price = input.nextDouble();

            total += price;
        }
        input.close();

        System.out.println("Your total is $" + total);

    }
}
