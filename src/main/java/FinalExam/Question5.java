package FinalExam;
import java.util.Scanner;

// Name: Ethan Dakin
// Student Number: 8209194
// Question Number: 5
enum FireScale {LOW, MEDIUM, HIGH, EXTREME, CATASTROPHIC};
public class Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the maximum temperature for today: ");
        int temperature = scan.nextInt();

        System.out.print("Your fire warning is ");

        if (temperature <= 18) {
            System.out.print(FireScale.LOW);
        } else if (temperature <= 26) {
            System.out.print(FireScale.MEDIUM);
        } else if (temperature <= 34) {
            System.out.print(FireScale.HIGH);
        } else if (temperature <= 40) {
            System.out.print(FireScale.EXTREME);
        } else if (temperature > 40){
            System.out.print(FireScale.CATASTROPHIC);
        }
    }
}
