package FinalExam;
import java.util.Scanner;

// Name: Ethan Dakin
// Student Number: 8209194
// Question Number: 4

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the cost price (0 to end): ");
        double input = scan.nextDouble();

        while (input != 0) {
            System.out.printf("The sales price is $%.2f\n", calcPrice(input));

            System.out.print("Enter the cost price (0 to end): ");
            input = scan.nextDouble();
        }

    }

    public static double calcPrice(double costPrice) {
        double markUp = 32;
        double tax = 10;

        costPrice += (costPrice * (markUp / 100));
        costPrice += (costPrice * (tax / 100));

        return costPrice;
    }
}
