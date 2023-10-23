package FinalExam;
import java.util.Arrays;
import java.util.Scanner;

// Name: Ethan Dakin
// Student Number: 8209194
// Question Number: 7

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers do you want: ");
        int[] list = new int[scan.nextInt()];

        System.out.print("Please enter your numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }

        Arrays.sort(list);

        System.out.printf("%s  %s  %s\n", "Index", "Value", "Square");

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.printf("%5d%7d%8d\n", i, list[i], list[i] * list[i]);
        }
    }
}
