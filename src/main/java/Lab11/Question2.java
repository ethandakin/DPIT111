package Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int total = 0;

        System.out.print("The elements of your array are: ");



        for (int i : list) {
            System.out.print(list);
        }
    }

    public static int min(int[] array, int endIndex) {
        if (endIndex == 0) { return array[0];}
        return Math.min(array[endIndex], min(array, endIndex - 1));
    }
}
