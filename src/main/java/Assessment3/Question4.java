package Assessment3;
import java.util.Scanner;
/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 3
Question number: 4
-------------------------------------------------------*/
public class Question4 {
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        // Create strings
        String consonants = "";
        String input;

        do {
            // Input letter
            System.out.print("Enter a letter: ");
            // Use scan.next for next character typed, using nextLine will not stop at whitespace
            input = scan.next();

            // Switch statement for vowels, if it is aeiou then it breaks
            switch (input) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    break;
                default:
                    // Append to consonants
                    consonants += input;
            }
        }
        // Breaks the loop if input equals "."
        while (!input.equals("."));

        // Print the consonants
        System.out.print("The consonants entered are " + consonants);
    }
}
