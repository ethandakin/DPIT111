package Lab6;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the tree: ");
        int input = scan.nextInt();


        for (int i = 1; i <= input; i++) {
            for (int y = 1; y <= input - i; y++) {
                System.out.print(' ');
            }

            for (int x = (i * 2) - 1; x > 0; x--) {
                if (i == 1) {
                    System.out.print('*');
                } else {
                    if (Math.random() <= 0.125) {
                        System.out.print('*');
                    } else {
                        System.out.print("/");
                    }
                }
            }

            System.out.println();
        }

        for (int i = 1; i <= (input / 8); i++) {
            for (int y = 1; y <= input - 2; y++) {
                System.out.print(" ");
            }

            for (int z = 1; z <= (input / 4); z++) {
                System.out.print("+");
            }

            System.out.println();
        }

        main(args);
    }
}
