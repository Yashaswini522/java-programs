package myprogram;
class Parents {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}


public class virtual extends Parents{
	public static void main(String[] args) {
		virtual test = new virtual();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
	

}
