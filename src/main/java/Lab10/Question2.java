package Lab10;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        int sum = 0;
        int length = 15;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.print("Index\tElement\n");

        for (int i = 0; i < length; i++) {
            arrayList.add(i, (int) (20 + Math.random() * 90));
            sum += arrayList.get(i);
            System.out.printf("%d\t\t%7d\n", i, arrayList.get(i));
        }

        System.out.printf("%s\t\t%7d\n", "sum", sum);
    }
}
