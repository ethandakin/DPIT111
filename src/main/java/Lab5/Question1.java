package Lab5;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        System.out.println(wordToInt(scan.nextLine()));
    }

    public static int wordToInt(String input) {
        switch(input.toUpperCase()) {
            case "ONE":
                return(1);
            case "TWO":
                return(2);
            case "THREE":
                return(3);
            case "FOUR":
                return(4);
            case "FIVE":
                return(5);
            case "SIX":
                return(6);
            case "SEVEN":
                return(7);
            case "EIGHT":
                return(8);
            case "NINE":
                return(9);
            default:
                return(-1);
        }
    }
}
