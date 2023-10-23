package Lab4;

public class Question2 {
    public static void main(String[] args) {
        // Make sure program arguments are passed through
        double t = Double.parseDouble(args[1]); // T must be arg 1
        double r = Double.parseDouble(args[0]); // r must be a double, adjust methods
        System.out.println("r = " + r + ", t = " + t); // Missing semicolon
        double c = 2 * Math.PI * r;
        double A = Math.PI * r * r;
        double x = r * Math.cos(t); // Unknown function cos
        double y = r * Math.sin(t); // Unknown function sin
        System.out.println("c = " + c );
        System.out.println("A = " + A );
        System.out.println("x = " + x + ", " + "y = " + y );
    }

    /*

    public static void main(String[] args) {
        // Make sure program arguments are passed through
        double t = Double.parseDouble(args[0]); // t is argument 1
        int r = Integer.parseInt(args[0]); // r should be a double, adjust methods
        System.out.println("r = " + r + ", t = " + t) // Missing semicolon
        double c = 2 * Math.PI * r;
        double A = Math.PI * r * r;
        double x = r * cos(t); // Unknown function cos
        double y = r * sin(t); // Unknown function sin
        System.out.println("c = " + c );
        System.out.println("A = " + A );
        System.out.println("x = " + x + ", " + "y = " + y );
    }

     */
}
