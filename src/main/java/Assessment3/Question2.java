package Assessment3;
import java.util.Scanner;
/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 3
Question number: 2
-------------------------------------------------------*/
public class Question2 {
    public static void main(String[] args) {
        // Create scanner and int total
        Scanner scan = new Scanner(System.in);
        int total = 0;

        // Get input
        System.out.print("How many numbers do you want? ");
        int input = scan.nextInt();

        System.out.print("The total of ");
        // Generate random values
        for (int i = 0; i < input ; i++) {
            // Math.random is a random double >= 0.0 and < 1.0
            // We multiply this by 50 to make it between 49
            // This number cannot be larger than 1, so we multiply it by 50 to get it within bounds of 49
            // We must also turn this into an integer, since the example did not show any double in the output.
            int random = (int) (Math.random() * 50);
            // Print the random number on the same line
            System.out.print( random+ " ");
            // Add the random number to total
            total += random;
        }

        // Print out the average to one decimal place
        // This requires a type change to double, to show decimals.
        System.out.printf("is %d. The average is %.1f", total, (double) total / input);
    }
}
