package de.telran;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge_3 {
    public static void main(String[] args) {

        /*Create a game where the program picks a random number from 1 to 5 and you,
         the player, has to guess it.
         If the player guesses right, print “Correct! Aren’t you lucky.“
         If the player guesses wrong, print “Hard luck! Maybe next time.“
         You can use the line of code below which produces a random number from 1 to 5 and
         stores it in a variable called randomNumber. */

        System.out.println("ser"+ 1569%2);
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);
        System.out.println("Please enter your number from 1 to 6");
        int userNumber = scanner.nextInt();

        if (userNumber == randomNumber) {
            System.out.println("You guessed!");
        } else {
            System.out.println("You don't guess!");
            System.out.println("You  have one more chance");
            userNumber = scanner.nextInt();
        }
        if (userNumber == randomNumber) {
            System.out.println("You guessed!");
        } else {
            System.out.println("Sorry, you lose");
        }

//


    }

}