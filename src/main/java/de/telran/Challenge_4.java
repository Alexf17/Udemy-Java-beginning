package de.telran;

import java.util.Scanner;

public class Challenge_4 {
    public static void main(String[] args) {
        /**Activate the required method (the description below)*/
        doExercise1();
        doExercise2();
        doExercise3();
        doExercise4();

    }
    public static void doExercise1(){

          /*Create an integer array of 10 elements and give each element an arbitrary value.
         Print out the entire array using a loop.*/

        int[] array = new int[10];
        array[0] = 12;
        array[1] = 11;
        array[2] = 12;
        array[3] = 22;
        array[4] = 14;
        array[5] = 32;
        array[6] = 21;
        array[7] = 42;
        array[8] = 93;
        array[9] = 18;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void doExercise2() {
         /* Use a loop to populate an array with integers from 1 to 20.
         Use another loop to print the contents of the array (the elements) backwards.*/

    int [] array = new int[20];
       int number =1;
       for (int i = 0; i <array.length; i++) {
           array[i]=number++;
       }
       for (int i = 0; i < array.length; i++) {
           System.out.println(array[i]);
       }
    }

    public static void doExercise3() {
          /* Create an array of five doubles and give each element some value.
         Calculate the sum of all the elements and
         print the result.
         Calculate the mean/average of all the elements and print that too.*/

        double[] array = new double[5];
        array[0] = 1.1;
        array[1] = 1.5;
        array[2] = 2.5;
        array[3] = 3.4;
        array[4] = 1.9;

        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        double average = result / array.length;
        System.out.printf("%.2f \n", result);
        System.out.println("average : " + average);
    }

    public static void doExercise4(){
         /*Write a program which asks the user to enter their top five favourite foods and store their answers
         in a string array.
         However, create the array, so it can only hold a maximum of three strings.
         After the user enters the third item, print “No more memory available.”,
         then print out the contents of the array.*/

        Scanner scanner = new Scanner(System.in);
        String [] favorite = new String[3];
        for (int i = 0; i < favorite.length; i++){
            System.out.println("Please enter your favorite food");
            String food = scanner.nextLine();
            favorite[i] = food;
        }
        System.out.println("No more memory available.\n");
        System.out.print("Your favorite food is : ");
        for (String s : favorite) {
            System.out.print(s + ", ");
        }
    }
}
