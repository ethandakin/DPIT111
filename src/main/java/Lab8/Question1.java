package Lab8;
import java.util.*;

public class Question1 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Which type of user are you: Gold (G) / Silver (S) member or non-member (N): ");
        String input = scan.next();
        double rate = getRate(input);

        if (rate != 0.0) {
            System.out.print("How many hours would you like to book the court for: ");
            double hours = scan.nextDouble();
            System.out.printf("The court costs %.2f\n", rate);
            System.out.print("Your court fee is: ");
            if (rate != 15.0) {
                System.out.printf("%.2f", calculateFee(hours));
            } else {
                System.out.printf("%.2f", calculateFee(hours, input));
            }

        } else {
            System.out.println("Please enter a valid input");
        }

    }

    public static double getRate(String membershipType) {
        switch(membershipType.toUpperCase()) {
            case "G":
                return 13.5;
            case "S":
                return 14.5;
            case "N":
                return 15.0;
            default:
                return 0;
        }
    }
    public static double calculateFee(double hours, String membershipType) {
        return getRate(membershipType) * hours;
    }

    public static double calculateFee(double hours) {
        return getRate("N") * hours;
    }
}
