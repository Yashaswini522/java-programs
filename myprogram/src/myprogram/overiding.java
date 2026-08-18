package myprogram;

public class overiding {
	void minbal() {
		System.out.println("0");
	}
	void minbal(int a) {
	
		System.out.println("sufficient");
	}
	public static void main(String[] args) {
		overiding test = new overiding();// object
		test.minbal();
		test.minbal(3);
	}

}
