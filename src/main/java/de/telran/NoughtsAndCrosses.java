package de.telran;

import java.util.Scanner;

public class NoughtsAndCrosses {
    public static void main(String[] args) {
        char[] positions = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        Scanner scanner = new Scanner(System.in);
        int input;
        char sign = 'X';
        int counter = 0;
        System.out.println("Hello ! Lets play Noughts & Crosses! ");
        System.out.println("You can use the numbers in NumLockBlocks");
        System.out.println("  " + " |  " + " | " + "   ");
        System.out.println("---+---+---");
        System.out.println("  " + " |  " + " | " + "   ");
        System.out.println("---+---+---");
        System.out.println("  " + " |  " + " | " + "   ");

        while (true) {
            do {
                System.out.print("Enter position:  ");
                input = scanner.nextInt();
                if (positions[input - 1] == 'X' || positions[input - 1] == 'O') {
                    System.out.println("This position is not empty");
                }
            } while (positions[input - 1] == 'X' || positions[input - 1] == 'O');

            positions[input - 1] = sign;
            counter++;
            System.out.println(" " + positions[6] + " | " + positions[7] + " | " + positions[8] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[3] + " | " + positions[4] + " | " + positions[5] + " ");
            System.out.println("---+---+---");
            System.out.println(" " + positions[0] + " | " + positions[1] + " | " + positions[2] + " ");

            if (positions[0] == sign && positions[1] == sign && positions[2] == sign
                    || positions[3] == sign && positions[4] == sign && positions[5] == sign
                    || positions[6] == sign && positions[7] == sign && positions[8] == sign
                    || positions[0] == sign && positions[3] == sign && positions[6] == sign
                    || positions[1] == sign && positions[4] == sign && positions[7] == sign
                    || positions[2] == sign && positions[5] == sign && positions[8] == sign
                    || positions[0] == sign && positions[4] == sign && positions[8] == sign
                    || positions[2] == sign && positions[4] == sign && positions[6] == sign) {
                System.out.println("Congratulations! " + sign + " wins!");
                break;
            }
            if (counter == 9) {
                System.out.println("Congratulations! Your result is a DRAW! ");
                break;
            }

            if (sign == 'X') {
                sign = 'O';
            } else if (sign == 'O') {
                sign = 'X';

            }

        }


    }
}
