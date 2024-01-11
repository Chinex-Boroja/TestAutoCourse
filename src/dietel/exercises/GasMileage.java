package dietel.exercises;

import java.util.Scanner;

/**
 * (Gas Mileage) Drivers are concerned with the mileage their automobiles get.
 * One driver has kept track of several trips by recording the miles driven and gallons used for each tankful.
 * Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.
 * The program should calculate and display the miles per gallon obtained for each trip and print the combined miles per
 * gallon obtained for all trips up to this point.
 * All averaging calculations should produce floating-point results.
 * Use class Scanner and sentinel-controlled iteration to obtain the data from the user.
 */
public class GasMileage {
    public static void main(String[] args) {
        getMileage();
    }
    public static void getMileage() {

        double totalMileage = 0;
        int tripCounter = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Please enter the miles driven by your car or -1 to quit: ");
            int milesDriven = input.nextInt();

            if (milesDriven == -1)
                break;

            System.out.print("Please enter the gallons of diesel used so far or -1 to quit: ");
            int gallonsUsed = input.nextInt();

            if (gallonsUsed == -1)
                break;

            double milesPerGallon = (double) milesDriven / gallonsUsed;
            System.out.printf("The average mileage per gallon covered for this trip is %.2fmpg%n", milesPerGallon);

            totalMileage += milesPerGallon;
            tripCounter++;
        }

        if (tripCounter != 0) {
            System.out.printf("Total mileage for all the %d trips is %.2fmpg%n", tripCounter, totalMileage);
        }
        else {
            System.out.println("Nothing was recorded!!");
        }

        input.close();
    }
}
