package abstraction;

public class TestAbstraction {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(99, 10);
        rectangle.printMessage();
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());

    }
}
