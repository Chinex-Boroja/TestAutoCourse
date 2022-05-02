package exercises.demo4;

import java.util.Random;

public class RoleTheDiceGame {

    public static void main(String[] args) {

        int gameSpace = 20;
        int diceRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        for (int i = 1; i <= diceRolls; i++) {
            int dice = random.nextInt(6) + 1;

            currentSpace = currentSpace + dice;
            System.out.print(String.format("Roll #%d: You rolled a %d. ", i, dice));

            if (currentSpace == gameSpace) {
                System.out.println("You are on space " + currentSpace + ". Congrats, you win!");
                break;
            } else if (currentSpace > gameSpace) {
                System.out.println("Oh! That takes you past " + gameSpace + " spaces. You have lost");
                break;
            }else if (i == diceRolls && currentSpace < gameSpace) {
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        gameSpace + " spaces. You lose!");
            } else{
                int spacesToGo = gameSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}
