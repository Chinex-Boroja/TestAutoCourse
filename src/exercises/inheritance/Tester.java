package exercises.inheritance;

public class Tester {

    public static void main(String[] args) {

        Cake cake = new Cake();
        cake.setFlavor("Levine");
        cake.setPrice(500);
        System.out.println("The cake's flavour is " + cake.getFlavor() + " with price of $" + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(560);
        System.out.println("The birthday cake's flavour is " + birthdayCake.getFlavor() + " with price of $" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(700);
        System.out.println("The wedding cake's flavour is " + weddingCake.getFlavor() + " with price of $" + weddingCake.getPrice());
    }
}
