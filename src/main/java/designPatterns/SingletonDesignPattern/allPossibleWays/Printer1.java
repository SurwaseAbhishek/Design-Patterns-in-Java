package designPatterns.SingletonDesignPattern.allPossibleWays;

public class Printer1 extends Object{
	private static Printer1 INSTANCE;
	
	private Printer1() {
		System.out.println("do u thing it will work from external ways !! Fool");
	}
	
	public static Printer1 getInstance() {
		if(INSTANCE==null) {
			INSTANCE = new Printer1();
		}
		return INSTANCE;
	}
}
