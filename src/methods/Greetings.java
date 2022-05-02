package methods;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String action = scanner.next();
        greetUser(name, action);
    }

    public static void greetUser(String name, String action) {
        System.out.println("Hi there, " + name + " " + action);
    }
}
