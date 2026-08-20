package day_3program;
import java.util.Scanner;
public class demoo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "";
        int age = 0;
        String designation = "";
        int salary = 0;
        int choice;
        do {
            System.out.println("\n1) Create");
            System.out.println("2) Display");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    name = sc.next();
                    System.out.print("Enter age: ");
                    age = sc.nextInt();
                    if (age < 18 || age > 60) {
                        System.out.println("Invalid age");
                        continue;
                    }
                    System.out.print("Enter designation: ");
                    designation = sc.next();                  	
                    if (!designation.equals("programmer") && 
                    		!designation.equals("manager") && 
                    		!designation.equals("tester")) {
                    System.out.println("Invalid designation");
                    break;
                }
                    System.out.print("Enter salary: ");
                    salary = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Designation: " + designation);
                    System.out.println("Salary: " + salary);
                    break;
                case 3:
                    salary = salary + 5000;
                    System.out.println("New Salary: " + salary);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }
}


