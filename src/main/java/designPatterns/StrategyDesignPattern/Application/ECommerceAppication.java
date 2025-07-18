package designPatterns.StrategyDesignPattern.Application;

import java.util.Arrays;
import java.util.Random;

import designPatterns.StrategyDesignPattern.Couriertype.Courier;

public class ECommerceAppication {
	private Courier courier;

	public ECommerceAppication() {
		System.out.println("ECommerceAppication.)-Param-Constructor()");
	}
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
	public String shopping(String[] items,double[] amount) {
		double totalAmount=0.0f;
		for(double prodAmount:amount) {
			totalAmount+=prodAmount;
		}
		
		String msg = Arrays.toString(items)+"with Amount"+Arrays.toString(amount)+"Total is ::"+totalAmount;
		int rNo = new Random().nextInt(1000);
		
		String courierMsg = courier.deliverProduct();
		return rNo+" : "+msg+" : "+courierMsg;
	}
}
