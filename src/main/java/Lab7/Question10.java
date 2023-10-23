package Lab7;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scan.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int s = 0; s < i; s++ ) {
                System.out.print(' ');
            }

            for (int x = 1; x <= ((rows - i) * 2 + 1); x++) {
                if (x%2 == 0) {
                    System.out.print(rows - i);
                } else {
                    System.out.print(i + 1);
                }
            }

            System.out.println();
        }
    }
}
