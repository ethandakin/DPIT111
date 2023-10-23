package Assessment2;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 2
Question number: 4
-------------------------------------------------------*/

// This is a program to calculate the average of 3 numbers entered by the user

import java.util.Scanner;

// Class name was changed to fit the file name, sorry : (
public class Question4 {

    // This should be public, or better yet created inside main
    private static double average;

    public static void main(String[] args) {

        double total = 0;
        // Input 3 numbers and add the input to total
        // This was not working when you inputted total as a parameter, I'm not sure why, scope error?
        total += readNumber();  // 1st number
        total += readNumber();  // 2nd number
        total += readNumber();  // 3rd number

        // Get the average by dividing it by 3
        average = total / 3;

        // Display result
        System.out.println("The average of your 3 numbers is: " + average);
    }

    private static double readNumber() {
        // This is unoptimized, no need to create a new scanner for each input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // return scanned int
        return scan.nextDouble();
    }}

/*----------------------------------------------------------------------------
Make a list of the errors that you found here:
1) Arguments for main should be String[] args, not String args[]
2) Average must be static
3) Average should be double
4) total should be a double as specified in requirements
5) Scanner in readNumber method is constructed incorrectly (lowercase)
6) double number should be scan.nextDouble, not nextLine, because number is a double
7) System.out.printLn should be lowercase (System.out.println)
8) int Total is not being updated outside of scope, adjust method to return num and add that to total
9) Make readNumber method return double
----------------------------------------------------------------------------*/
