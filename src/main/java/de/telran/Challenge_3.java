package de.telran;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Challenge_3 {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] history = new String[7];

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        char answer;
        char sign;
        do {
            String expression = inputExpression();
            double[] arguments = parseArguments(expression);
            char[] signs = parseSigns(expression);
            double result = arguments[0];
            for (int i = 1; i < arguments.length; i++) {
                result = calculate(result, signs[i - 1], arguments[i]);
            }
            printResult(result, expression);
            saveHistory(expression, result);
            printHistory(history);
            do {
                System.out.println("Maybe you want to calculate anything else ? Y/N");
                answer = scanner.next().charAt(0);
                scanner.nextLine();
            }
            while (answer != 'y' && answer != 'Y' && answer != 'N' && answer != 'n');
        } while (answer == 'y' || answer == 'Y');
    }

    static double calculate(double firstArg, char sign, double secondArg) {
        double result = switch (sign) {
            case '+' -> firstArg + secondArg;
            case '-' -> firstArg - secondArg;
            case '*' -> firstArg * secondArg;
            case '/' -> firstArg / secondArg;
            case '%' -> firstArg % secondArg;
            default -> 0.0;
        };
        return result;
    }

    static String inputExpression() {
        System.out.print("Enter expression (1+2*3....): ");
        scanner.useLocale(Locale.ENGLISH);
        String expression = scanner.nextLine();
        return expression;
    }

    static void printResult(double result, String expression) {
        System.out.println(String.format("%s = %.2f", expression, result));
    }

    static char[] parseSigns(String expression) {
        int argCount = counterOfArguments(expression);
        char[] signs = new char[argCount - 1];
        int currentIndex = 0;
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (isSign(symbol)) {
                signs[currentIndex] = symbol;
                currentIndex++;
            }

        }
        return signs;
    }

    static double[] parseArguments(String expression) {
        int count = counterOfArguments(expression);
        double[] arguments = new double[count];
        int currentIndex = 0;
        StringBuilder argumentsAsString = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (!isSign(symbol)) {
                argumentsAsString.append(symbol);
            }
            if (isSign(symbol) || i == expression.length() - 1) {
                double argument = Double.parseDouble(argumentsAsString.toString());
                arguments[currentIndex] = argument;
                currentIndex++;
                argumentsAsString.delete(0, argumentsAsString.length());
            }
        }
        return arguments;
    }

    static boolean isSign(char symbol) {
        boolean conditions = symbol == '+' || symbol == '-' || symbol == '/' || symbol == '*' || symbol == '%';
        return conditions;
    }

    static void saveHistory(String expression, double result) {
        for (int i = history.length - 1; i > 0; i--) {
            history[i] = history[i - 1];
        }
        history[0] = String.format("%s = %.2f", expression, result);
    }

    static void printHistory(String[] history) {
        System.out.println("Computing history: ");
        for (int i = 0; i < history.length; i++) {
            if (history[i] == null) {
                history[i] = "-";
            }
        }
        System.out.println(Arrays.toString(history));
    }

    static int counterOfArguments(String expression) {
        int counter = 0;
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            if (isSign(symbol)) {
                counter++;
            }
        }
        return counter + 1;
    }
}
