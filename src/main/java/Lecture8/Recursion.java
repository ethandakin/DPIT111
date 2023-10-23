package Lecture8;

public class Recursion {
    public static void main(String[] args) {
        System.out.print(calcTotal(25));
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }

    public static int power(int num, int pow) {
        if (pow == 1) {
            return num;
        } else {
            return num * power(num, pow - 1);
        }
    }

    public static int calcTotal(int num) {
        if (num == 1) {
            return num;
        } else {
            return num + calcTotal(num - 1);
        }
    }
}
