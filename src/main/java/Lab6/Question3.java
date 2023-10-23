package Lab6;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int x = i; x <= input; x++) {
                System.out.print(x);
            }

            System.out.println();
        }
    }
}
