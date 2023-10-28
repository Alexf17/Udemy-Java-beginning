package de.telran;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.exit;

public class Challenge_6 {
    public static void main(String[] args) {

        /**Activate the required method (the description below)*/

//        quiz ();
        multiplicationTable();
//        guessMyNumber();
//        statistic();

    }
    public static void quiz (){

           /*Write a quiz program with five true-or-false questions. Display a question to the user, and ask
        the user to enter either true or false, then move on to the next question. At the end of the quiz
        display the user’s score.
        Use three arrays, a String array for holding the questions, a boolean array for the answers, and
        another boolean array for the user’s answers.

        Hints:
        You can use the Scanner’s nextBoolean() method to get the user’s input
        Because the questions, answers, and user’s answers are stored in three separate arrays,
        you can use their indexes to associate them (e.g. index 1 in the answers array correlates to
        index 1 in the questions array)*/

        Scanner sc = new Scanner(System.in);
        String[] questions = {"Isn't the earth round?", "Is weather in winter cold?", "Is weather in summer hot?"};
        boolean[] answers = {false, true, true};
        boolean[] usersAnswers = new boolean[3];
        boolean answer;
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Please enter true or false : ");
            usersAnswers[i] = sc.nextBoolean();

            if (answers[i] == usersAnswers[i]) {
                score++;
            }
        }
        System.out.println("You gave " + score + " correct answer(s)!");

    }

    public static void multiplicationTable(){
        /*Display the entire multiplication table as a table*/

        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%2d ", i * j);
            }
            System.out.println();
            if (i == 1) {
                System.out.println("-".repeat(30));
            }
        }
//                for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= 9; j++) {
//                System.out.printf("%dx%d=%d%n", i, j, i * j);
//            }
//            System.out.println();
//        }
    }

    public static void guessMyNumber(){
               /*Back in “Coding Challenge 4 - Loops”, you were tasked to write a guess-my-number game.
        The program picked a random number from 1 and 100 and you had to guess it.
        This time, reverse the roles. Think of a number from 1 to 100 and write a program which tries to guess it.
        Type “higher” if the program guesses too low, or “lower” if the program guesses too high. Have the program
        make subsequent guesses based on this information. When the program guesses your number type “correct”
        and end the program.

        Hint: Remember, if you need it, you can use the following line of code to generate a random number:
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);*/

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber;
        System.out.print("Please enter a number from 1 to 100 (I won't peek :) ), then I guess it: ");
        int question = scanner.nextInt();
        scanner.nextLine();
        int counter = 0;
        int min = 1;
        int max = 101;

        do {
//            randomNumber = ThreadLocalRandom.current().nextInt(min,max);
            randomNumber = random.nextInt(max - min) + min;
            System.out.print("My number is: " + randomNumber);
            if (question == randomNumber) break;
            System.out.println(".  My number higher or lower ? ");
            String answer = scanner.nextLine();

            if (answer.contentEquals("higher")) {
                min = randomNumber;
            }
            if (answer.contentEquals("lower")) {
                max = randomNumber;
            }
            if ((min == max - 1)|| max==min) {
                System.out.println("\nThat's not possible. Let's try again.");
              exit(1);

            }
            counter++;

        }
        while (true);
        System.out.println("Wow , I guessed ! and I used  " + counter + " attempts!");
    }

    public static void statistic(){
        /*You have been tasked with writing a program for a school which
        produces some statistics on students’ exam results. The users
        are teachers who will input each student’s score, and any other
        necessary data. Store the scores in an array. The program
        should output:

        Each student’s score and percentage for the exam
        The mean (average) score and percentage of the exam
        Hints:
        Have the program ask how many students took the exam,
        so it knows how many scores to process.
        The program will also need to know the maximum possible
        score that can be achieved.
        It will also need to ask the user to input each student’s
        score (you can refer to each student as a number,
        e.g. “Student 1”, “Student 2”, etc, rather than asking
        for names.)*/

        Scanner scanner = new Scanner(System.in);
        int totalScore=0;
        System.out.print("Enter the count of students: ");
        int countOfStudents = scanner.nextInt();
        int [] students = new int[countOfStudents];
        System.out.print("Enter max score: ");
        int maxPoint = scanner.nextInt();
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter please score for Student "+(i+1)+": ");
            int studentScore = scanner.nextInt();
            students[i] = studentScore;
        }
        for (int i = 0; i < students.length; i++) {
            int percentage = (int) (((double) students[i] /maxPoint)*100);
            totalScore+= students[i];
            System.out.printf("Score for Student %d: %d and his percentage is %d %% \n",(i+1),students[i], percentage);
        }
        int averageScore = totalScore/students.length;
        int averagePercentage = (int) (((double) averageScore /maxPoint)*100);
        System.out.println("The average score is "+averageScore+" , and average percentage: "+averagePercentage+"% !");






    }
}
