package de.telran;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge_4 {
    public static void main(String[] args) {

        /* Write a program which asks the user for a password. Make the password “*****”.
         Each time the user enters the password incorrectly, prompt them for a password again.
         When the user enters the password correctly, print “ACCESS APPROVED.” */

        String password = "12345";
        String input;
        do {
            System.out.println("Enter password: ");
            Scanner scanner = new Scanner(System.in);
            input = scanner.nextLine();
        } while (!input.equals(password));
        {
        }
        System.out.println("ACCESS APPROVED");

        /*Write a program which makes use of a loop to print the following output:
         0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.*/

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b.");

        /* How to subtract fractions correctly?*/

        double a = 2.1;
        double b = 4.5;
        System.out.println(b - a);

        /* Write a program which prints numbers from 1 to 40.
         After every third number, print “Quack.”.= */
        int count = 1;
        for (int i = 1; i <= 40; i++) {
            System.out.println(i);
            if (count == 3) {
                System.out.println("Quack.");
                count = 0;
            }
            count++;
        }

        /* Create a game where the program picks a random number from 1 to 100 and the player has to
         guess it. Each time the player makes a guess, print “HIGHER” if the guess was too low or
         “LOWER” if the guess was too high. If the player correctly guesses the number,
         print “CORRECT”, then end the game.
         You can use the line of code below which produces a random number from 1 to 100,
         and stores it in randomNumber.*/

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println("You have to guess my number ");
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        int number;
        do {
            System.out.print("Enter number ");
            number = scanner.nextInt();
            counter++;
            System.out.println(number > randomNumber ? "HIGHER " : "LOWER");
//            if (number > randomNumber) {
//                System.out.println("HIGHER ");
//            }
//            if (number < randomNumber) {
//                System.out.println("LOWER");
//            }
        } while (number != randomNumber);

        System.out.println("CORRECT, random number was " + randomNumber + ", you used " + counter + " attempts!");

    }
}
