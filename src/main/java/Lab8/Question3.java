package Lab8;
import java.util.*;

public class Question3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input the number of rows: ");
        int max = scan.nextInt();

        recursionNum(1, max);
    }

    public static void recursionNum(int num, int max) {
        if (num <= max) {
            System.out.printf("%d.", num);
            recursionNum(num + 1, max);
        }
    }
}
