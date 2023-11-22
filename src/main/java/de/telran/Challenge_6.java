package de.telran;

import java.util.Arrays;

public class Challenge_6 {
    private Challenge_6() {

    }

//    public static String generateWord(int length) {
//
//        StringBuilder word = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            char randomChar = (char) ('a' + Math.random() * 26);
//            word.append(randomChar);
//        }
//        return word.toString();
//    }

//    public static String generateNumeric(int length) {
//
//        StringBuilder numericString = new StringBuilder();
//        for (int i = 0; i < length; i++) {
//            char randomDigit = (char) ('0' + Math.random() * 10);
//            numericString.append(randomDigit);
//        }
//        return numericString.toString();
//    }

    public static String[] splitByFirst(String newSentence) {
        String input = newSentence;
        char charToBreake = 'a';

        char[] charArray = input.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            char c = input.charAt(i);
            /* if (!Character.isLetterOrDigit(c)) OR -> */
            if(c > 31 && c < 48) {
                charToBreake = c;
                break;
            }
        }
        String [] newArray = input.split(String.valueOf(charToBreake));

        return newArray;
    }



//public static String[] splitByFirst(String input) {
//    String[] result = new String[2];
//
//    int splitIndex = -1;
//
//    // Ищем индекс первого вхождения символа '!' или пробела
//    int exclamationIndex = input.indexOf(' ');
//    int spaceIndex = input.indexOf('!');
//
//    // Определяем, какой из символов встречается первым и используем его для разделения
//    if (exclamationIndex != -1 && (spaceIndex == -1 || exclamationIndex < spaceIndex)) {
//        splitIndex = exclamationIndex;
//    } else if (spaceIndex != -1) {
//        splitIndex = spaceIndex;
//    }
//
//    if (splitIndex == -1) {
//        // Если не найден символ для разделения, возвращаем всю строку в первой части и пустую строку во второй
//        result[0] = input;
//        result[1] = "";
//    } else {
//        // Иначе разделяем строку на две части
//        result[0] = input.substring(0, splitIndex).trim();
//        result[1] = input.substring(splitIndex).trim();
//    }
//
//    return result;
//}

//    public static boolean isNumeric(String input) {
//        if (input == null || input.isEmpty()) {
//            return false;
//        }
//
//        for (char c : input.toCharArray()) {
//            if (!Character.isDigit(c)) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static void main(String[] args) {
//        String randomWord = generateWord(8);
//        System.out.println("Random Word: " + randomWord);
//
//        String randomNumeric = generateNumeric(6);
//        System.out.println("Random Numeric: " + randomNumeric);

        String[] splitResult = splitByFirst("Люди! Я люблю Java! Ура!");
        System.out.println(Arrays.toString(splitResult));

//        String numericString = "1234h5";
//        boolean isNumeric = isNumeric(numericString);
//        System.out.println("Is Numeric: " + isNumeric);
    }
}
