package Lab11;
import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("The length of your array is: ");
        int[] list = new int[scan.nextInt()];
        int total = 0;

        System.out.print("The elements of your array are: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scan.nextInt();
        }

        System.out.print("The minimum of {");
        for (int i = 0; i < list.length; i++) {
            System.out.printf("%d", list[i]);

            if (i != list.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("} is %d.", min(list, list.length - 1));
    }

    public static int min(int[] array, int endIndex) {
        if (endIndex == 0) { return array[0];}
        return Math.min(array[endIndex], min(array, endIndex - 1));
    }
}
