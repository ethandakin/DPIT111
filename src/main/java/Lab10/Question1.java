package Lab10;

public class Question1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = new int[15];

        System.out.print("Index\tElement\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (50 + Math.random() * 100);
            sum += array[i];
            System.out.printf("%d\t\t%7d\n", i, array[i]);
        }

        System.out.printf("%s\t\t%7d\n", "sum", sum);
    }
}
