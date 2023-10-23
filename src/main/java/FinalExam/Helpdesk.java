package FinalExam;

import java.util.Scanner;

// Name: Ethan Dakin
// Student Number: 8209194
// Question Number: 8
public class Helpdesk {
    private int custNum;
    private Problem issue1;
    private Problem issue2;
    private boolean resolved;

    public Helpdesk(int custNum, int probNum1, String description1, int probNum2, String description2, boolean resolved) {
        this.custNum = custNum;
        this.issue1 = new Problem(probNum1, description1);
        this.issue2 = new Problem(probNum2, description2);
        this.resolved = resolved;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the customer number: ");
        int custNum = Integer.parseInt(scan.nextLine());
        System.out.print("Enter issue 1 problem number: ");
        int probNum1 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter issue 1 description: ");
        String description1 = scan.nextLine();
        System.out.print("Enter issue 2 problem number: ");
        int probNum2 = Integer.parseInt(scan.nextLine());
        System.out.print("Enter issue 2 description: ");
        String description2 = scan.nextLine();

        Helpdesk helpdesk = new Helpdesk(custNum, probNum1, description1, probNum2, description2, false);
        System.out.print(helpdesk);
        helpdesk.setResolved(true);
        System.out.print(helpdesk);
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
    }

    public String toString() {
        String resolved;

        if (this.resolved) {
            resolved = "RESOLVED";
        } else {
            resolved = "OUTSTANDING";
        }

        return String.format("\nCustomer %d %s problems:\n%s\n%s\n", this.custNum, resolved, this.issue1, this.issue2);
    }
}

class Problem {
    private int probNum;
    private String description;

    public Problem(int probNum, String description) {
        this.probNum = probNum;
        this.description = description;
    }

    public String toString() {
        return String.format("%d: %s", this.probNum, this.description);
    }
}
