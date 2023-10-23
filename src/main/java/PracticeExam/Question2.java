package PracticeExam;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int input = scan.nextInt();

        System.out.printf("The result is %d", addSquares(input));
    }

    public static int addSquares(int number) {
        if (number == 1) {
            return 1;
        } else {
            return (number * number) + addSquares(number - 1);
        }
    }
}
