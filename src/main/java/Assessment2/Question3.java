package Assessment2;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 2
Question number: 3
-------------------------------------------------------*/
public class Question3 {
    public static void main(String[] args) {
        // Generate random double, multiplied by 100.0 to get a random value between 0 - 100
        double randomNum = (Math.random() * 100.0);
        // Round randomNum after multiplying it by 1000.0
        randomNum = Math.round(randomNum * 1000.0);
        // Divide randomNum by 1000.0
        randomNum /= 1000.0;
        /* Doing this rounding, multiplication and division cuts the double off at 3 decimal places
         This was not necessary for string formatting, but this would cause logical errors
         (If the randomNum was 87.48138, the square would be 7652.991
         However, if you decided to check the result with a calculator, you would get 7652.925361 */

        // Print the generate number, formatted to 3 decimal places again (this prevents x.000)
        System.out.printf("Your random number is %.3f. Choose an option from the following menu: \n", randomNum);

        // Print out available options for manipulating the number
        System.out.println("1) Convert this to an integer");
        System.out.println("2) Square this number");
        System.out.println("3) Find the square root of this number");
        System.out.print("Please choose an option: ");

        // Switch case from Scanner nextInt method
        switch (new Scanner(System.in).nextInt()) {
            case 1:
                // Convert to integer
                // (I tried doing this with %.3f, but this was rounding it, so I just converted the type
                System.out.printf("The result is %d \n", (int) randomNum);
                break;
            case 2:
                // Square the number
                System.out.printf("The result is %.3f \n", Math.pow(randomNum, 2));
                break;
            case 3:
                // Find the square root
                System.out.printf("The result is %.3f \n", Math.sqrt(randomNum));
                break;
        }
    }
}
