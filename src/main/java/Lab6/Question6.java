package Lab6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of rows: n=");
        int input = scan.nextInt();


        for (int i = 1; i <= input; i++) {


            for (int x = 1; x <= i; x++) {
                System.out.print('#');
            }

            for (int x = 1; x <= i; x++) {
                System.out.print('-');
            }

            for (int x = 1; x <= ((input * 2) + 2 - (i * 2)); x++) {
                System.out.print('#');
            }


            System.out.println();
        }
    }

}
