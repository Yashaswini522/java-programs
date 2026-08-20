package day_3program;
import java.util.Iterator;

class MyTask implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class Demo {
	 public static void main(String[] args) {

	        MyTask task = new MyTask();

	        Thread t = new Thread(task);

	        t.start();

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main Thread: " + i);
	        }
	    }
	}

