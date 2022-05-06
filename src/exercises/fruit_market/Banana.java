package exercises.fruit_market;

public class Banana extends Fruit{

    public void peel() {
        System.out.println("Banana is being peeled");

    }

    public Banana() {
        setCalories(50.78);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana Juice is made");
    }
}
