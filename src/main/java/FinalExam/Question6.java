package FinalExam;
import java.util.Scanner;

// Name: Ethan Dakin
// Student Number: 8209194
// Question Number: 6

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        System.out.printf("The result is %d.", doCalc(scan.nextInt()));
    }

    public static int doCalc(int num) {
        if (num == 1) {
            return 1;
        } else {
            if (num % 2 == 0) {
                return (doCalc(num - 1)) - 2;
            } else {
                return (doCalc(num - 1)) + (num * 2);
            }
        }
    }
}
