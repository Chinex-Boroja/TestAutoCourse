package exercises.fruit_market;

public class Apple extends Fruit{

    public void removeSeed() {

    }

    public Apple() {
        setCalories(89.78);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple Juice is made");
    }
}
