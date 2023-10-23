package Assessment3;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 3
Question number: 1
-------------------------------------------------------*/

public class Question1 {
    public static void main(String[] args) {
        // Create scanner and total
        Scanner scan = new Scanner(System.in);
        double total = 0;
        // Output string and get input from scan.next
        System.out.print("Do you want to add an item to your list? (y/n)? ");
        // I used scan.next because using scan.nextLine stops only at break lines,
        // and since I am only looking for a single character (y/n), this makes more sense.
        String input = scan.next();

        // While input is y (yes)
        while (input.equals("y")) {
            // Get the double for the cost
            System.out.print("What is the cost of this item? ");
            total += scan.nextDouble();
            // Continue the loop
            System.out.print("Do you want to add an item to your list? (y/n)? ");
            // This will then repeat the loop, as if input is y, it will call itself again
            // else if it is n, it will print the total cost
            input = scan.next();
        }

        // Print the total formatted to 2 decimal places
        System.out.printf("The total cost of your shopping list is $%.2f.", total);
    }
}
