package Assessment5;
import java.util.*;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 5
Question number: 3
-------------------------------------------------------*/

public class Restaurant {
    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);
        // Create arraylist for order class
        ArrayList<Order> orders = new ArrayList<Order>();
        // Make menu list array
        Menu[] menuList = new Menu[3];
        // Create initial menu items
        menuList[0] = new Menu("Hamburger", 5.50);
        menuList[1] = new Menu("Cheeseburger", 4.20);
        menuList[2] = new Menu("Vege Burger", 4.80);
        // Create input variable
        int input = 0;

        do {
            // Print menu
            printMenu(menuList);
            // Get user input
            System.out.print("Enter your option: ");
            input = scan.nextInt();

            // If input is not quit then
            if (input <= menuList.length) {
                // Get customer name
                System.out.print("Enter customer's name: ");
                String name = scan.next();

                // Add the new order to the arraylist, subtracting one from input (menuList starts at 0)
                orders.add(new Order(name, menuList[input - 1]));
                // Print new line
                System.out.println();
            }
            // Quit is equal to menuList.length + 1 (4 in this case)
        } while (input != menuList.length + 1);

        // Print orders
        printOrders(orders);
    }

    public static void printMenu(Menu[] menuList) {
        // Print initial menu, with a new line
        System.out.print("Menu: \n");
        // Print all items in menuList array, with a tab indentation
        for (int i = 0; i < menuList.length; i++) {
            System.out.printf("\t%d: %s\n", i + 1, menuList[i]);
        }

        // Print Quit as the final item (length + 1)
        System.out.printf("\t%d: %s\n", menuList.length + 1, "Quit");
    }

    public static void printOrders(ArrayList<Order> orders) {
        System.out.println("\nYour orders are:");

        for (Order order: orders) {
            System.out.println(order);
        }
    }
}

class Menu {
    // Attributes, item and price
    private String item;
    private double price;

    // Constructor, sets item and price
    public Menu(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String toString() {
        // Return formatted item and price, with 2 decimal places on the price
        return String.format("%s $%.2f", this.item, this.price);
    }
}

class Order {
    // Attributes order and name
    private String name;
    private Menu order;

    // Constructor
    public Order(String name, Menu order) {
        this.name = name;
        this.order = order;
    }

    public String toString() {
        // Return formatted string, with order name, and menu string in brackets
        return String.format("%s (%s)", this.name, this.order);
    }
}