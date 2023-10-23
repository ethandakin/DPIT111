package Lab10;

public class Question7 {
    public static void main(String[] args) {
        double[] myDoubleNumbers = {1.0,3.1,5.2,7.9,9.8,2.5,4.6,6.8,8.9,10.2};
        double sum = 0.0;

        for (double i : myDoubleNumbers) {
            sum += i;
            System.out.print(i + " ");
        }

        System.out.print("\n" + sum);
    }
}
