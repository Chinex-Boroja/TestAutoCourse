package exercises.animal;

public class Farm {

    public static void main(String[] args) {

        Animal duck = new Duck();
        System.out.println(duck.makeSound());
        duck.eat("Maize grains");
        System.out.println();

        Animal pig = new Pig();
        System.out.println(pig.makeSound());
        pig.eat("Green grass");
    }
}
