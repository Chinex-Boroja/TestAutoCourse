package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {


        //createNewFile();
        //numbersExceptionHanding();
    }

    private static void createNewFile() {
        File file = new File("notes.txt");
        try {
            file.createNewFile();
        }catch (IOException e) {
            System.out.println("Directory does not exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHanding() {

        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        //used for classes that implement closeable and auto closable interfaces
        //try(Scanner fileReader = new Scanner(file)) {
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double numbers = fileReader.nextDouble();
                System.out.println(numbers);
            }
        }catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }finally {
            //method close() make invoke nullPointer exception
            assert fileReader != null;
            fileReader.close();
        }
    }
}
