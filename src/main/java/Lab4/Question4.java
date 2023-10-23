package Lab4;
import java.util.Scanner;

public class Question4 {
    public static double nA, nB;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number nA:");
        nA = scan.nextDouble();
        nB = Math.exp(nA);
        int nC = (int) nB;
        System.out.println(nC);
    }
}
