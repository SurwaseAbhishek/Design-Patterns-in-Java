package designPatterns.SingletonDesignPattern.allPossibleWays.threadsToTest;

import designPatterns.SingletonDesignPattern.allPossibleWays.Printer2;

public class Thread2 extends Thread {
	public void run() {
		Printer2 p2;
		try {
			p2 = Printer2.getInstance();
			System.out.println(p2.hashCode());
		} catch (InterruptedException | InstantiationException e) {
			e.printStackTrace();
		}
	}
}
