package classes_and_objects;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();

        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();

        double area = calculator.calculatorTotalArea(kitchen, bathRoom);
        System.out.println("The total area is: " + area);
        calculator.input.close();

    }

    public Rectangle getRoom() {
        System.out.println("Enter the length of your room:");
        double length = input.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = input.nextDouble();

        return new Rectangle(length, width);

    }

    public double calculatorTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.getArea() + rectangle2.getArea();
    }
}
