package Assessment4;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 4
Question number: 3
-------------------------------------------------------*/

public class Drinks {
    // Default attributes for Drinks class
    private String name;
    private int size;
    private int rating;

    public Drinks() {
        // Default constructor, defaults to coffee
        name = "coffee";
        size = 200;
        rating = 8;
        // Print out object creation
        System.out.println("Coffee drink created!\n");
    }

    public Drinks(String name, int size, int rating) {
        // Constructor with drink parameters
        this.name = name;
        this.size = size;
        this.rating = rating;
        // Print out object creation
        System.out.println("new drink created!\n");
    }

    public Drinks(Drinks drink) {
        // Clone constructor
        this.name = drink.name;
        this.size = drink.size;
        this.rating = drink.rating;
        // Print out object cloned
        System.out.println("new drink has been copied!\n");
    }

    public static Drinks createDrink() {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        // Print menu
        System.out.print("Menu:");
        System.out.print("\n1) Create a coffee drink (default constructor)");
        System.out.print("\n2) Create a drink of your own choice");
        System.out.print("\nWhat is your option? ");
        // Get menu choice
        int choice = scan.nextInt();

        // If choice is Create a drink then
        if (choice == 2) {
            // Get drink inputs
            System.out.print("What is the name of the drink? ");
            String name = scan.next();

            System.out.print("What is the size of the drink? ");
            int size = scan.nextInt();
            System.out.print("What is the rating of the drink? ");
            int rating = scan.nextInt();

            // Return drink
            return new Drinks(name, size, rating);
        } else { // Else return default coffee drink
            return new Drinks();
        }
    }

    public String toString() {
        // Return formatted string, with information about the name, size and rating
        return String.format("%s (%d ml): Rating %d", this.name, this.size, this.rating);
    }

    public static void main(String[] args) {
        // Create 2 drinks, and clone the second one
        Drinks drink1 = createDrink();
        Drinks drink2 = createDrink();
        Drinks drink3 = new Drinks(drink2);

        // Print out the drinks
        System.out.println("Your drinks are:");
        System.out.println(drink1);
        System.out.println(drink2);
        System.out.println(drink3);
    }
}
