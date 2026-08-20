package day_3program;
import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = "";
        int age = 0;
        String designation = "";
        int salary = 0;
        int choice;

        do {

            System.out.println("\n===== **** =====");
            System.out.println("1. Create");
            System.out.println("2. Display");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            // CREATE
            case 1:
                System.out.print("Enter name: ");
                name = sc.nextLine();

                // Maximum 3 words
                while (name.trim().split("\\s+").length > 3) {
                    System.out.println("Invalid name! Maximum 3 words allowed.");
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                }

                // AGE
                System.out.print("Enter age: ");
                age = sc.nextInt();

                if (age < 18 || age > 60) {
                    System.out.println("Invalid age! Age must be between 18 and 60.");
                    break;
                }

                // DESIGNATION
                while (true) {

                    System.out.println("\nSelect Designation:");
                    System.out.println("1. Programmer");
                    System.out.println("2. Manager");
                    System.out.println("3. Tester");

                    System.out.print("Enter designation choice: ");
                    int d = sc.nextInt();

                    if (d == 1) {
                        designation = "Programmer";
                        salary = 20000;
                        break;
                    }
                    else if (d == 2) {
                        designation = "Manager";
                        salary = 25000;
                        break;
                    }
                    else if (d == 3) {
                        designation = "Tester";
                        salary = 15000;
                        break;
                    }
                    else {
                        System.out.println("Invalid designation!");
                    }
                }

                System.out.println("Employee created successfully!");
                break;


            // DISPLAY
            case 2:
                System.out.println("\n===== EMPLOYEE DETAILS =====");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Designation: " + designation);
                System.out.println("Salary: " + salary);
                break;


            // RAISE SALARY
            case 3:
                salary = salary + 500;
                System.out.println("Salary raised by 500.");
                System.out.println("New Salary: " + salary);
                break;


            // EXIT
            case 4:
                System.out.println("Exiting program...");
                break;


            default:
                System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
	}
	

}
