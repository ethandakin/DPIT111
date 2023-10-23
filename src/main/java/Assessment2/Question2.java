package Assessment2;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 2
Question number: 2
-------------------------------------------------------*/

// I added another type into the enum, Other, for any value that isn't in the list
enum ComputerType {DESKTOP, LAPTOP, TABLET, PHONE, OTHER}

public class Question2 {
    public static void main(String[] args) {
        // Declare scanner and ints
        Scanner scan = new Scanner(System.in);
        ComputerType firstChoice, secondChoice;
        int total;

        // Initial print for menu
        System.out.println("Item Menu: ");
        System.out.println("1) " + ComputerType.DESKTOP);
        System.out.println("2) " + ComputerType.LAPTOP);
        System.out.println("3) " + ComputerType.TABLET);
        System.out.println("4) " + ComputerType.PHONE);
        // Input both choices
        System.out.print("Please enter first choice: ");
        firstChoice = getEnum(scan.nextInt());

        System.out.print("Please enter second choice: ");
        secondChoice = getEnum(scan.nextInt());

        // Calculate the total. An if statement with input integer returns price
        total = getPrice(firstChoice) + getPrice(secondChoice);

        // Print the total, formatting with first and second choice
        System.out.printf("Renting a %s and a %s will cost you $%d a month.", firstChoice, secondChoice, total);
    }

    public static int getPrice(ComputerType input) {
        if (input == ComputerType.DESKTOP) {
            return 120;
        } else if (input == ComputerType.LAPTOP) {
            return 140;
        } else if (input == ComputerType.TABLET) {
            return 85;
        } else if (input == ComputerType.PHONE) {
            return 95;
        } else {
            return 0;
        }
    }

    public static ComputerType getEnum(int input) {
        if (input == 1) {
            return ComputerType.DESKTOP;
        } else if (input == 2) {
            return ComputerType.LAPTOP;
        } else if (input == 3) {
            return ComputerType.TABLET;
        } else if (input == 4) {
            return ComputerType.PHONE;
        } else {
            return ComputerType.OTHER;
        }
    }
}
