package Assessment4;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 4
Question number: 1
-------------------------------------------------------*/

public class Question1 {
    public static void main(String[] args) {
        // Print out formatted strings, demonstrating method overloading
        // First one is int * int
        System.out.printf("%d times %d equals %d\n", 3, 4, calcMult(3, 4));
        // Second one is int * double
        System.out.printf("%d times %.2f equals %.1f\n", 3, 4.24, calcMult(3, 4.24));
        // Last one is double * double
        System.out.printf("%.1f times %.2f equals %.1f", 3.1, 4.24, calcMult(3.1, 4.24));
    }

    public static int calcMult(int num1, int num2) {
        // Return int * int
        return num1 * num2;
    }

    public static double calcMult(int num1, double num2) {
        // Return int * double
        return num1 * num2;
    }

    public static double calcMult(double num1, double num2) {
        // Return double * double
        return num1 * num2;
    }
}
