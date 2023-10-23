package Assessment4;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 4
Question number: 2
-------------------------------------------------------*/

public class Question2 {
    public static void main(String[] args) {
        // Get user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your starting number: ");
        int start = scan.nextInt();
        // Print out sequence start
        System.out.print("\nYour sequence is ");
        // Start recursive loop
        showNextIteration(start, 1);
    }

    public static void showNextIteration(int originalNumber, int iteration) {
        // Will only be called 5 times
        if (iteration <= 5) {
            // Print out number and a space
            System.out.print(originalNumber + " ");
            // Call function again but add 10 to the number and 1 to the iteration
            showNextIteration(originalNumber + 10, iteration + 1);
        }
    }
}
