package Lab7;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
      
      Scanner scan = new Scanner(System.in);
      
      int num = 1;
      int total = 0;
      int counter = 0;
      int highest = 0;
      
      // read a sequence of numbers from the user, ending in zero
        do {
            System.out.print("Enter a number (0 to exit): ");
            num = scan.nextInt();
            total += num;
            counter++;
            if (num>highest) {
                highest = num;
            }
        } while (num != 0);
      
      // print the total numbers entered and the highest number
      System.out.println("You entered " + counter + " numbers and the highest was " + highest);
    }
}
