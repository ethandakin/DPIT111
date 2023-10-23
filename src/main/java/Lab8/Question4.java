package Lab8;
import java.util.*;

public class Question4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the number of rows: ");
        int max = scan.nextInt();

        System.out.printf("The result is %d", formula(max));
    }

    public static int formula(int n) {
        if (n == 1) {
            return 2;
        } else {
            return formula(n - 1) + (n * 2);
        }
    }
}
