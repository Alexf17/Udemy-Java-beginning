package de.telran.Challenges;

import java.util.Scanner;

public class Challenge_7 {
    public static Scanner scanner = new Scanner(System.in);
    public static String[] guests = new String[10];

    public static void main(String[] args) {
        addTestGuest();
        do {
//            displayGuests();
            displayMenu();
            int options = getOption();
            if (options != 1 && options != 2 && options != 3 && options != 4 && options != 5&& options != 6) {
                continue;
            }
            System.out.println("---------------------------");

            if (options == 1) {
                displayGuests();
            } else if (options == 2) {
                addGuest();
            } else if (options == 3) {
                removeGuest();
            } else if (options == 4) {
                renameGuest();
            }else if (options == 5) {
                addGuestAtPosition();
            }
            if (options == 6) {
                break;
            }
        } while (true);

        System.out.println("Program is stopped!");
    }

   static void displayGuests() {
        System.out.println("------List of guest------");
        int count = 0;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ": " + guests[i]);
                count++;
            }
        }
        if (count == 0) System.out.println("\nGuests list is empty");
    }

    static void displayMenu() {
        System.out.println("___________________________");
        System.out.println("        -Menu- \n");
        System.out.println("Press 1 for: Display all guests");
        System.out.println("Press 2 for: Add guest");
        System.out.println("Press 3 for: Remove guest");
        System.out.println("Press 4 for: Rename guest");
        System.out.println("Press 5 for: Add guest in concrete position");
        System.out.println("Press 6 for: Exit");


    }

    static int getOption() {
        System.out.print("Your options: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Enter name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void removeGuest() {

        System.out.println("Enter the name (or number) of the guest to be removed: ");
        String name = scanner.next();
        boolean isDeleted = false;
        if (name.equals("1") || name.equals("2") || name.equals("3") || name.equals("4") || name.equals("5") || name.equals("6") || name.equals("7") || name.equals("8") || name.equals("9") || name.equals("10")) {
            int index = Integer.parseInt(name);
            guests[index - 1] = null;
            isDeleted = true;
        }
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].toLowerCase().equals(name)) {
                guests[i] = null;
                isDeleted = true;
                break;
            }
        }
        if (!isDeleted) System.out.println("Error: There is no guest with that name or number.");
        String[] sortedGuests = new String[guests.length];
        int newIndex = 0;
        for (String guest : guests) {
            if (guest != null) {
                sortedGuests[newIndex] = guest;
                newIndex++;
            }
        }
        guests = sortedGuests;
    }

    static void renameGuest() {
        displayGuests();
        System.out.println("Enter the number of the guest to be renamed: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        while (number > 10 || number<1|| guests[number - 1] == null) {
            displayGuests();
            System.out.println("Enter please correct number: ");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Enter new name for guest: " + guests[number - 1]);
        String newName = scanner.nextLine();
        System.out.println("new guest: " + newName);
        guests[number - 1] = newName;
    }

    static void addTestGuest() {
        guests[0] = "Andre";
        guests[1] = "Elena";
        guests[2] = "Svetlana";
        guests[3] = "Alex";
        guests[4] = "Hanna";
    }
    static void addGuestAtPosition() {
        System.out.println("Enter the number of position which you want to add a new guest(max №10): ");
        int position = scanner.nextInt();
        scanner.nextLine();
        if(position>0 && position<=10){
            System.out.print("Enter name of guest: ");
            String newName = scanner.nextLine();
            for (int i = guests.length-1; i > position-1; i--) {
                guests[i] = guests[i-1];
            }
            guests[position-1] =newName;
        } else System.out.println("Please enter correct number ");

    }
}
