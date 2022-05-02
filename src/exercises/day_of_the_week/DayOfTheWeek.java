package exercises.day_of_the_week;

import java.util.Scanner;

public class DayOfTheWeek {

    static String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    static Scanner scanner = new Scanner(System.in);
    static int number;

    public static void main(String[] args) {
        System.out.println("Enter a number corresponding to the day of a week: ");
        number = scanner.nextInt();
        scanner.close();

        System.out.println("Corresponding day: " + dayOfWeek[number - 1]);
    }

//    public static String getDay() {
//        for (int i = 0; i < dayOfWeek.length; i++) {
//
//        }
//    }
}
