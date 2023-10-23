package PracticeExam;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        int input = scan.nextInt();

        for (int i = 0; i < input; i++) {
            list.add(i, (int) (Math.random() * 100));
        }

        System.out.printf("%s\t%s\n", "Index", "Element");

        for (int i = list.size() -1; i >= 0; i--) {
            System.out.printf("%-5d\t%-7d\n", i, list.get(i));
        }
    }
}
