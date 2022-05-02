package exercises.demo5;

import java.util.Scanner;

public class Exercise5 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the base cost for the plan:");
        double baseCost = input.nextDouble();

        System.out.println("Enter overage minutes");
        double overageMinutes = input.nextDouble();

        input.close();

        double overageCharge = computeOverAgeFees(overageMinutes);
        double tax = calculateTax(baseCost + overageCharge);

        calculateFinalTotal(baseCost, overageCharge, tax);
    }

    public static double calculateTax(double subTotal) {
        double rate = 0.15;
        double tax = subTotal * rate;
        return tax;
    }

    public static double computeOverAgeFees(double extraMinutes) {
        double rate = 0.25;
        double overage = extraMinutes * rate;
        return overage;

    }
    public static void calculateFinalTotal(double base, double overage, double tax) {
        double finalTotal = base + overage + tax;

        System.out.println("----Phone Bill Statement----");
        System.out.println("Plan: #" + String.format("%.2f", base));
        System.out.println("Overage: #" + String.format("%.2f", overage));
        System.out.println("Tax: #" + String.format("%.2f", tax));
        System.out.println("Total: #" + String.format("%.2f", finalTotal));
    }
}
