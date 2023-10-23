package Lab5;
import java.util.Scanner;


public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        System.out.println(getEnumFromInt(scan.nextInt()));
    }

    public static numbers getEnumFromInt(int input) {
        if (input - 1 >= 0 && input - 1 <= 8) {
            return numbers.values()[input - 1];
        } else {
            return numbers.OTHER;
        }
    }
}
