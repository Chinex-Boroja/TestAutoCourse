package exercises.animal;

public abstract class Animal {

    public abstract String makeSound();

    public void eat(String eat) {
        System.out.println("I am eating " + eat);
    }
}
