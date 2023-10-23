package Lab4;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        System.out.println(PrintNumberInWord.getWord(number));
    }
}

class PrintNumberInWord {
    public static String getWord(int number) {
        if (number == 1) {
            return "ONE";
        } else {
            if (number == 2) {
                return "TWO";
            } else {
                if (number == 9) {
                    return "NINE";
                } else {
                    return "OTHER";
                }
            }

        }
    }
}