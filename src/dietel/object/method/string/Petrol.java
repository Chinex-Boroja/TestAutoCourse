package dietel.object.method.string;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {

        PetrolPurchase purchase = new PetrolPurchase(
                "Ile-Ife", "PMS", 1, 700, 17);

        Scanner input = new Scanner(System.in);
        System.out.print("Please indicate how many litres of fuel you want to buy: ");
        int quantity = input.nextInt();
        purchase.setQuantityPurchased(quantity);

        System.out.println("Hi! You are getting " + quantity + " litres of " + purchase.getPetrolType());
        System.out.printf("%s N%.2f%n", "Total amount payable:", purchase.getPurchaseAmount());

    }
}
