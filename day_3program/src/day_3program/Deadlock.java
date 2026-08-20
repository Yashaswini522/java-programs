package day_3program;
import java.util.Iterator;

class Resource{
	synchronized void withdraw(int amount) {
		System.out.println("withdrawing"+amount);
		try {
			Thread.sleep(4000);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		System.out.println("withdrawl completed");
		
	}
synchronized void withdraw() {
	
}
}


public class Deadlock {

}
