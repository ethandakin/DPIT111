package Lab6;
import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();
        int peak = input;
        int total = input;
        int loops = 0;

        while (input != 0) {
            System.out.print("Enter a number: ");
            input = scan.nextInt();
            total += input;

            if (input > peak) {
                peak = input;
            }

            loops++;
        }

        System.out.printf("The total is %d%n", total);
        System.out.printf("The average is %.1f%n", ((double) total / (double) loops));
        System.out.printf("The highest number is %d%n", peak);
    }
}
