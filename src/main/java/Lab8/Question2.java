package Lab8;
import java.util.*;

public class Question2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the number of rows: ");
        int max = scan.nextInt();

        hash(1, max);
    }

    public static void hash(int num, int max) {
        if (num <= max) {
            System.out.print("#");
            hash(num + 1, max);
        }
    }
}
