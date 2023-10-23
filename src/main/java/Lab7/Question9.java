package Lab7;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fruitName = "";

        do {
            System.out.print("Please enter the fruit name: ");
            fruitName = scan.next();
            double value = getFruitPrice(fruitName);

            if (value != 0.0) {
                System.out.print("Price is $" + value);
                System.out.println();
            }

        } while (!fruitName.equalsIgnoreCase("quit"));

        System.out.println("Thank you!");
    }

    public static double getFruitPrice(String name) {
        switch(name.toLowerCase()) {
            case "apple":
                return 5.5;
            case "orange":
                return 3.0;
            case "pear":
                return 4.5;
            case "grape":
                return 8.0;
            default:
                return 0.0;
        }
    }
}
