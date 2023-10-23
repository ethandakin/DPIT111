package Lab6;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        for (int i = 1; i <= input; i++) {
            System.out.print(i);
        }
    }
}
