package javaprogrm;

import java.util.Scanner;

class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // Create employee
    void create() {
        Scanner sc = new Scanner(System.in);

        // Name validation
        while (true) {
            System.out.print("Enter name (First Name Last Name): ");
            name = sc.nextLine();

            if (name.trim().matches("[A-Za-z]+\\s+[A-Za-z]+")) {
                break;
            } else {
                System.out.println("Enter a valid name with 2 words.");
            }
        }

        // Age validation
        while (true) {
            System.out.print("Enter age: ");
            age = sc.nextInt();

            if (age >= 18 && age <= 60) {
                break;
            } else {
                System.out.println("Age must be between 18 and 60.");
            }
        }

        sc.nextLine(); // clear buffer

        System.out.print("Enter designation: ");
        designation = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();
    }

    // Display employee
    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    // Raise salary
    void raiseSalary() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary raise percentage: ");
        double percentage = sc.nextDouble();

        salary = salary + (salary * percentage / 100);

        System.out.println("Salary raised successfully!");
        System.out.println("New Salary: " + salary);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Create Employee");
            System.out.println("2. Display Employee");
            System.out.println("3. Raise Salary");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    emp.create();
                    break;

                case 2:
                    emp.display();
                    break;

                case 3:
                    emp.raiseSalary();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
