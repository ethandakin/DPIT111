package Lab7;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = number; i >= 1; i--) {
            for (int j = i; j <= i + 3; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
