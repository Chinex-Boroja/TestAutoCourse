package exercises.demo3;
/*
    **The objective of the game is to enter enough change to equal exactly $1.
    **Create a program that asks a user to enter the quantities for the following coins:
    **pennies, nickels, dimes, and quarter. Your program should count up the value of all
    **the change. If it's exactly $1, they win! If it's more than $1, tell them by how much they
    **went over. If it's less than $1, tell them by how much they went under. Feel free to change
    **the game for your country's currency
 */

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        System.out.println("How many pennies would you like?");
        Scanner input = new Scanner(System.in);
        int pennies = input.nextInt();

        System.out.println("How many nickels would you like?");
        int nickels = input.nextInt();

        System.out.println("How many dimes would you like?");
        int dimes = input.nextInt();

        System.out.println("How many quarters would you like?");
        int quarters = input.nextInt();

        input.close();

        double countTotal = penny * pennies + nickel * nickels + dime * dimes + quarter * quarters;

        if (countTotal < dollar) {
            double amountShort = dollar - countTotal;

            System.out.println("Sorry, you lose! you were short " + String.format("%.2f", amountShort) + "cents.");
        }
        else if (countTotal > dollar) {
            double amountOver = countTotal - dollar;
            System.out.println("Sorry, you lose! you were over " + String.format("%.2f", amountOver) + "cents.");
        }
        else {
            System.out.println("You win!! that's exactly $1.00");
        }
    }
}
