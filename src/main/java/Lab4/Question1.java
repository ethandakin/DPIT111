package Lab4;
import java.util.*;

public class Question1 {
    public static void main(String [] args){

        double xCoordinate, yCoordinate, radius;//declare x, y, r as double

        Scanner keyboard = new Scanner(System.in);//get input from keyboard

        System.out.print("Enter x: ");
        xCoordinate = keyboard.nextDouble();//input x

        System.out.print("Enter y: ");
        yCoordinate = keyboard.nextDouble();//input y

        radius = Math.sqrt(Math.pow(xCoordinate,2) + Math.pow(yCoordinate,2));//compute r = (x^2+y^2)^0.5

        System.out.printf("Radius = %.2f\n", radius);//output radius with 2 decimal point precision

        System.out.print("Enter remainingDouble: ");
        double remainingDouble = keyboard.nextDouble();//input remainingDouble, when did we input it?

        System.out.printf("remainingDouble = %f\n", remainingDouble);//output
    }
}
