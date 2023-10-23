package Lab6;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter a number: ");
        int input = scan.nextInt();

        while (counter != input) {
            counter++;
            System.out.print(counter);
        }
    }
}
