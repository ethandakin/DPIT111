package Assessment3;
import java.util.Scanner;
/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 3
Question number: 3
-------------------------------------------------------*/
public class Question3 {
    public static void main(String[] args) {
        // Declare scanner
        Scanner scan = new Scanner(System.in);
        // Print and get input
        System.out.print("Enter the number of rows: ");
        int row = scan.nextInt();
        // Print for output
        System.out.println("The pattern is as follows: ");

        // Loops once up to input n
        for (int i = 0; i <= row; i++) {
            // Loops for input - i (e.g input is 5, loop is 4, prints 1 hash)
            for (int hash = 0; hash < (row - i); hash++) {
                System.out.print('#');
            }

            // Loops for i number of times, printing lines
            // e.g, i is 5, prints 5 lines
            for (int line = 0; line < i; line++) {
                System.out.print('-');
            }

            // Print new line
            System.out.println();
        }
    }
}
