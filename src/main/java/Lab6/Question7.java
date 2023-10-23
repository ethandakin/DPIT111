package Lab6;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int x = (i * 2) - 1; x > 0; x-=2) {
                System.out.print(x);
            }

            System.out.println();
        }
    }
}
