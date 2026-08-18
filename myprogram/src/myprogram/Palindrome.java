package myprogram;

public class Palindrome {
	public static void main(String[]args) {
		int n=121;
		int original=n;
		int reverse=0;
		while(n>0) {
			int digit=n%10;
			reverse=reverse*10+digit;
			n=n/10;
			
		}
		if(original==reverse) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
