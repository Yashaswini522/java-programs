package day_3program;
import java.util.Iterator;

class acc
{

    synchronized void withdraw(int amount) {
        System.out.println("Withdrawing " + amount);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Withdrawal completed");
    }
}

class MyThread extends Thread {
    acc bank;
    MyThread(acc bank) {
        this.bank = bank;
    }
    public void run() {
        bank.withdraw(500);
    }
}




public class Synch {
	public static void main(String[] args) {
        acc bank = new acc();
        MyThread t1 = new MyThread(bank);
        MyThread t2 = new MyThread(bank);

        t1.start();
        t2.start();
    }
	

}
