package Assessment5;
import java.util.Scanner;
import java.util.Arrays;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 5
Question number: 1
-------------------------------------------------------*/

public class Question1 {
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        // Print initial input
        System.out.print("How many numbers do you want in your list? ");
        // Create array, with upper bound inputted from scanner
        int[] list = new int[scan.nextInt()];
        // Initialize total variable
        int total = 0;
        // Print second input
        System.out.print("Enter those numbers: ");
        // For loop that reads all the integers inputted up to list.length
        for (int i = 0; i < list.length; i++) {
            // Add input to list
            list[i] = scan.nextInt();
            // If it is divisible by 2 (even) then add one to it
            if (list[i] % 2 == 0) {
                list[i] += 1;
            }
        }
        // Sort the array
        Arrays.sort(list);
        // Print output
        System.out.print("Your sorted list as odd numbers is ");
        // Enhanced for loop through list
        for (int i : list) {
            // Print out each element with spaces
            System.out.printf("%d ", i);
            // Add to total
            total += i;
        }
        // Print out total
        System.out.printf("with a total of %d", total);
    }
}
