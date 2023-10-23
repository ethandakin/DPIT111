package PracticeExam;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scan.next();

        if (input.charAt(0) == 'a' || input.charAt(0) == 'z') {
            input = input.toUpperCase();
        }

        System.out.printf("Your word is %s.", input);
    }
}
