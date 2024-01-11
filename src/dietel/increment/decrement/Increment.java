package dietel.increment.decrement;

public class Increment {
    public static void main(String[] args) {

        // demonstrate postfix increment operator
        int c = 5;
        System.out.printf("c before post-incrementing: %d%n ", c);
        System.out.printf(" post-incrementing: %d%n ", c++);
        System.out.printf("c after post-incrementing: %d%n ", c);

        System.out.println();

        // demonstrate prefix increment operator
        c = 5;
        System.out.printf("c before pre-incrementing: %d%n ", c);
        System.out.printf(" pre-incrementing: %d%n", ++c);
        System.out.printf("c after pre-incrementing: %d%n", c);

        int x = -2;
        int total = 0;
        while (x <= 10) {
            int y = x+2;
            x++;
            total += y;
            System.out.printf("Y is: %d and total is %d\n", y, total);
        }


    }
}
