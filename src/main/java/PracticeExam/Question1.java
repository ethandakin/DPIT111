package PracticeExam;
import java.util.Scanner;

enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer in [1, 7]: ");
        int input = scan.nextInt();

        switch (input) {
            case 1:
                System.out.println("You have a lecture on " + Day.MONDAY);
                break;
            case 2:
            case 3:
            case 6:
            case 7:
                System.out.println("It is time to review lecture notes and lab exercises");
                break;
            case 4:
            case 5:
                System.out.println("You have a lab on " + Day.THURSDAY + " or " + Day.FRIDAY);
                break;
            default:
                System.out.println("Please enter a number in [1, 7]");
                break;
        }
    }
}
