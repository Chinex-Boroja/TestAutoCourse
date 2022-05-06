package exercises;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a sentence: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char letter = sentence.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        System.out.println("The number of vowels in this particular sentence is: " + count);
    }
}
