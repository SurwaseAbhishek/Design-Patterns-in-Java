package designPatterns.SingletonDesignPattern.allPossibleWays.threadsToTest;

import designPatterns.SingletonDesignPattern.allPossibleWays.Printer2;

public class Thread1 extends Thread {
	public void run() {
		Printer2 p1;
		try {
			p1 = Printer2.getInstance();
			System.out.println(p1.hashCode());
		} catch (InterruptedException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}
