package Lab4;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mark");
        int mark = scan.nextInt();
        System.out.println(CheckPassFail.getGrade(mark));
    }
}

class CheckPassFail {
    public static String getGrade(int mark) {
        if (mark >= 50) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}