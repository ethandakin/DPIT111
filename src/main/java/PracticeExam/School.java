package PracticeExam;
import java.util.Scanner;

public class School {
    private Employee schoolHead;
    private Employee lecturer;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first name of school head: ");
        String schoolHeadFirstName = scan.nextLine();
        System.out.print("Enter the last name of school head: ");
        String schoolHeadLastName = scan.nextLine();
        System.out.print("Enter the join order of school head: ");
        int schoolHeadJoinOrder = Integer.parseInt(scan.nextLine());

        System.out.print("Enter the first name of lecturer: ");
        String lecturerFirstName = scan.nextLine();
        System.out.print("Enter the last name of lecturer: ");
        String lecturerLastName = scan.nextLine();
        System.out.print("Enter the join order of lecturer: ");
        int lecturerJoinOrder = Integer.parseInt(scan.nextLine());

        School school = new School(schoolHeadFirstName, schoolHeadLastName, schoolHeadJoinOrder, lecturerFirstName, lecturerLastName, lecturerJoinOrder);
        school.printEmployee();
    }

    public School(String schoolHeadFirstName, String schoolHeadLastName, int schoolHeadJoinOrder, String lecturerFirstName, String lecturerLastName, int lecturerJoinOrder) {
        this.schoolHead = new Employee(schoolHeadFirstName, schoolHeadLastName, schoolHeadJoinOrder);
        this.lecturer = new Employee(lecturerFirstName, lecturerLastName, lecturerJoinOrder);
    }

    private void printEmployee() {
        System.out.printf("School head: %s %d\n", this.schoolHead.getFullName(), this.schoolHead.getStaffNumber());
        System.out.printf("Lecturer: %s %d", this.lecturer.getFullName(), this.lecturer.getStaffNumber());
    }
}

class Employee {
    private String fullname;
    private int staffNumber;

    public Employee(String firstName, String lastName, int joinOrder) {
        this.fullname = String.format("%s %s", firstName, lastName);
        this.staffNumber = 399000 + joinOrder;
    }

    public String getFullName() {
        return this.fullname;
    }

    public int getStaffNumber() {
        return this.staffNumber;
    }
}