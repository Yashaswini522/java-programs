package javaprogrm;

import java.util.Scanner;

public class armstrong {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number");
		int n=sc.nextInt();
		
		int original=n;
		int sum=0;
		
		while(n>0) {
			int digit=n%10;
			sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==original) {
			System.out.println("it is an armstrong number");
			
		}
		else {
			System.out.println("it is not an amstrong");
		}
		
		
	}
	
	

}
