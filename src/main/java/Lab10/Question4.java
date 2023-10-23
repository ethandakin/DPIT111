package Lab10;

public class Question4 {
    public static void main(String[] args) {
        char[] monday = {'M', 'o', 'n', 'd', 'a', 'y'};
        char[] tuesday = {'T', 'u', 'e', 's', 'd', 'a', 'y'};
        char[] wednesday = {'W', 'e', 'd', 'n', 'e', 's', 'd', 'a', 'y'};

        char[][] weekdays = {monday, tuesday, wednesday};

        System.out.print("Weekdays\n");
        for (char[] day: weekdays) {
            for (char i : day) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
