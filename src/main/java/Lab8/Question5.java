package Lab8;
import java.util.*;

public class Question5 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String [] args){
        System.out.print("Please input your first guess: ");
        int first = scan.nextInt();
        int target = (int) (Math.random() * 50);
        System.out.print(target);
        makeGuess(target, first);
    }

    public static void makeGuess(int target, int lastGuess) {
        System.out.print("Please input your next guess: ");
        int guess = scan.nextInt();
        int lastDifference = Math.abs(target - lastGuess);
        int difference = Math.abs(target - guess);

        if (guess != target) {
            if (difference == lastDifference) {
                System.out.println("Your guess is neither warmer nor colder.");
            } else if (difference > lastDifference) {
                System.out.println("Your guess is colder.");
            } else {
                System.out.println("Your guess is warmer");
            }

            makeGuess(target, guess);
        } else {
            System.out.print("Your guess is correct.");
        }
    }
}
