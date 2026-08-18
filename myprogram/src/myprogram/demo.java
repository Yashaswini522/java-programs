package myprogram;

public class demo {
	void m1() {
		System.out.println("hello there");
	}
	void m1(int a) {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		demo test = new demo();// object
		test.m1();
		test.m1(3);
	}
	
	

}
