package exercises;

public class DividingByZero {

    public static void main(String[] args) {

        try {
            int c = 30 / 0;
        }catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by zero");
            e.printStackTrace();
        }finally {
            System.out.println("Division is fun");
        }
    }
}
