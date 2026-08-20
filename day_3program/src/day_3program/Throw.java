package day_3program;
import java.util.Scanner;

public class Throw {
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("not eligible for vote");
			
		}else {
			System.out.println("Welcome to the voteing");
				
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your age");
		int n=sc.nextInt();
		validate(n);
		System.out.println("rest of the code");
		
		
	}
	

}
