package Lab7;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to avoid: ");
        int number = scan.nextInt();

        for (int i = 1; i <= 40; i++) {
            if (i % number == 0 || i % 10 == number) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}
