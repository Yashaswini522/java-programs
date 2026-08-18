package myprogram;
import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        Employee e = new Employee();

	    int choice;

	    do {
	    	
	        System.out.println("\n1. Create");
	        System.out.println("2. Display");
	        System.out.println("3. Raise Salary");
	        System.out.println("4. Exit");

	        System.out.print("Enter your choice: ");
	        choice = sc.nextInt();
	        sc.nextLine();

	        switch (choice) {
	        case 1:
	        	
	            System.out.print("Enter name: ");
	            e.name = sc.nextLine();

	            System.out.print("Enter age: ");
	            e.age = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter designation (Programmer/Tester/Manager): ");
	            e.designation = sc.nextLine();

	            System.out.print("Enter salary: ");
	            e.salary = sc.nextDouble();

	            System.out.println("Employee created successfully!");
	            break;
	            

	        case 2:
	                System.out.println("\n--- Employee Details ---");
	                System.out.println("Name: " + e.name);
	                System.out.println("Age: " + e.age);
	                System.out.println("Designation: " + e.designation);
	                System.out.println("Salary: " + e.salary);
	                break;

	            case 3:
	                System.out.print("Enter salary raise: ");
	                double raise = sc.nextDouble();

	                e.salary = e.salary + raise;

	                System.out.println("Salary raised successfully!");
	                System.out.println("New salary: " + e.salary);
	                break;

	            case 4:
	                System.out.println("Exit");
	                break;

	            default:
	                System.out.println("Invalid choice");
	            }

	        } while (choice != 4);

	        sc.close();
	    }
	}


