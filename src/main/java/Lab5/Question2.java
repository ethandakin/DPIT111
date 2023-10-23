package Lab5;
import java.util.Scanner;

enum numbers {ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, OTHER}
public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        System.out.println(getEnumFromInt(scan.nextInt()));
    }

    public static numbers getEnumFromInt(int input) {
        switch(input) {
            case 1:
                return(numbers.ONE);
            case 2:
                return(numbers.TWO);
            case 3:
                return(numbers.THREE);
            case 4:
                return(numbers.FOUR);
            case 5:
                return(numbers.FIVE);
            case 6:
                return(numbers.SIX);
            case 7:
                return(numbers.SEVEN);
            case 8:
                return(numbers.EIGHT);
            case 9:
                return(numbers.NINE);
            default:
                return(numbers.OTHER);
        }
    }
}
