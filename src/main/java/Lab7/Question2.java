package Lab7;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String action = "";
        System.out.println("Please input the balance of your account");
        int balance = scan.nextInt();

        do {
            System.out.print("Please choose the interaction type deposit(D) or withdrawal(W) or quit(Q): ");
            action = scan.next();

            switch(action.toLowerCase()) {
                case "d":
                    System.out.print("How much would you like to deposit: ");
                    balance += scan.nextInt();
                    System.out.println("Your current balance is: " + balance + " dollars.");
                    break;
                case "w":
                    System.out.print("How much would you like to withdraw: ");
                    balance -= scan.nextInt();
                    System.out.println("Your current balance is: " + balance + " dollars.");
                    break;
            }
        } while (!action.equalsIgnoreCase("q"));

        System.out.println("Bye!");
    }
}
