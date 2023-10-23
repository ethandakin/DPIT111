package Lab4;
import java.util.Scanner;

public class Question3 {
    public static double nA, nB;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number nA:");
        nA = scan.nextDouble();
        nB = Math.pow(nA, 2.1);

        if(nB < 129.0) {
            nB = Double.parseDouble(String.format("%.2f", nB));
        }
        else {
            nB = 129.0;
        }

        System.out.println(nA + " " + nB);
    }
}
