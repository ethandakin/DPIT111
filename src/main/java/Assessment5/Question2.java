package Assessment5;
import java.lang.reflect.Array;
import java.util.*;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 5
Question number: 2
-------------------------------------------------------*/

public class Question2 {
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        // Print out initial input
        System.out.print("What is your starting number: ");
        // Get user input
        int input = scan.nextInt();
        // Initialize total variable
        int total = 0;
        // Create integer arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        // Add initial 1 value (it will never reach 1 in the do while loop)
        list.add(1);
        // Input sequence logic
        do {
            // Add input to list
            list.add(input);
            // If input is divisible by 3 then, divide it by 3
            if (input % 3 == 0) {
                input /= 3;
            } else {
                // Else, add one to the input
                input += 1;
            }
        } while (input != 1);
        // Sort the arraylist
        Collections.sort(list);
        // Print output
        System.out.println("Your sequence is:");
        // Print table headers with a tab space
        System.out.println("Number\tTotal");
        // Loop through list
        for (int i : list) {
            // Print value and total (with tab spaces, and an indent of 5 on the right side (length of "Total"))
            System.out.printf("%d\t\t%5d\n", i, total += i);
        }
    }
}
