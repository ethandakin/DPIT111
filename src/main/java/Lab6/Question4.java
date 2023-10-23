package Lab6;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int x = 0; x <= (input - i); x++) {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
