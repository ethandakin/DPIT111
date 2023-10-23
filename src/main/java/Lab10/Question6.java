package Lab10;

public class Question6 {
    public static void main(String[] args) {
        int[] random = new int[12];

        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (5 + Math.random() * 10);
            System.out.print(random[i] + " ");
        }
    }
}
