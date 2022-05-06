package exercises.fruit_market;

public class Market {

    public static void main(String[] args) {

        Banana banana = new Banana();
        banana.makeJuice();
        banana.peel();


        Fruit yellowBanana = new Banana();
        yellowBanana.makeJuice();
        yellowBanana.setCalories(90.45);

        Apple apple = new Apple();
        apple.makeJuice();

        squeeze(banana);
        squeeze(apple);

        Fruit blackberry = new Fruit();
        squeeze(blackberry);
    }

    public static void squeeze(Fruit fruit) {
        System.out.println("Squeezing...");
        fruit.makeJuice();
    }
}
