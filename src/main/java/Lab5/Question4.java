package Lab5;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Question4 {
    public static int randomNumber;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        randomNumber = ThreadLocalRandom.current().nextInt(1, 10);

        for (int i = 0; i < 3; i++) {
            System.out.print("Please enter your guess: ");
            int guess = scan.nextInt();
            System.out.println(getTemperature(guess));
            if (guess == randomNumber) {
                break;
            }
        }
    }

    public static String getTemperature(int guess) {
        switch (Math.abs(randomNumber - guess)) {
            case 0:
                return "correct";
            case 1:

            case 2:
                return "warm";

            default:
                return "cold";
        }
    }
}
