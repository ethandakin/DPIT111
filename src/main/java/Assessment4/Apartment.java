package Assessment4;
import java.util.Scanner;

/*------------------------------------------------------
My name: Ethan Dakin
My subject code: DPIT111
My student number: 8209194
My email address: ed675@uowmail.edu.au
Assignment number: 4
Question number: 4
-------------------------------------------------------*/

class Location {
    // Default attributes for Location
    private String address;
    private String suburb;

    public Location(String address, String suburb) {
        // Object constructor, assign address and suburb
        this.address = address;
        this.suburb = suburb;
    }

    public String toString() {
        // Return formatted string, with address and suburb displayed
        return String.format("%s, %s", this.address, this.suburb);
    }
}
public class Apartment {
    // Default attributes
    private double rent;
    private Location location;

    public Apartment(double rent, String address, String suburb) {
        // Constructor
        // Create location with address and suburb
        this.location = new Location(address, suburb);
        this.rent = rent;
    }

    public static void printDetails(Apartment apartment) {
        // Print out formatted string, with the apartment location (which will be a formatted string) and rent
        System.out.printf("%s ($%.2f)%n", apartment.location, apartment.rent);
    }

    public static void main(String[] args) {
        // Create scanner
        Scanner scan = new Scanner(System.in);

        // Get apartment 1 info
        System.out.print("Enter apartment 1 rent: ");
        // Use parseDouble to prevent issues with nextLine
        double apartment1Rent = Double.parseDouble(scan.nextLine());
        System.out.print("Enter apartment 1 address: ");
        String apartment1Address = scan.nextLine();
        System.out.print("Enter apartment 1 suburb: ");
        String apartment1Suburb = scan.nextLine();

        System.out.print("Enter apartment 2 rent: ");
        // Use parseDouble to prevent issues with nextLine
        double apartment2Rent = Double.parseDouble(scan.nextLine());
        System.out.print("Enter apartment 2 address: ");
        String apartment2Address = scan.nextLine();
        System.out.print("Enter apartment 2 suburb: ");
        String apartment2Suburb = scan.nextLine();

        // Create apartments with information from scanner
        Apartment apartment1 = new Apartment(apartment1Rent, apartment1Address, apartment1Suburb);
        Apartment apartment2 = new Apartment(apartment2Rent, apartment2Address, apartment2Suburb);

        // Print details for the two apartments
        System.out.println("\nApartments:");
        printDetails(apartment1);
        printDetails(apartment2);
    }
}
