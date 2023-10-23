package Assessment2;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 2
Question number: 1
-------------------------------------------------------*/

public class Question1 {
    public static void main(String[] args) {
        // Declare scanner and integers
        Scanner scan = new Scanner(System.in);
        int x, y;

        // Input integer values
        System.out.print("Enter the first number: ");
        x = scan.nextInt();

        System.out.print("Enter the second number: ");
        y = scan.nextInt();

        // Check if x modulus y == 0 (This means there is no remainder left from division)
        // Print out if it has no remainder or not
        if (x % y == 0) {
            System.out.println(x + " can be divided by " + y);
        } else {
            System.out.println(x + " cannot be divided by " + y) ;
        }
    }
}
