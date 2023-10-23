package Lab7;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int x = 1; x <= rows; x++) {
                if (x <= i) {
                    System.out.print(i);
                } else {
                    System.out.print('-');
                }
            }

            for (int x = rows; x >= 1; x--) {
                if (x <= i) {
                    System.out.print(i);
                } else {
                    System.out.print('-');
                }
            }

            System.out.println();
        }
    }
}
