package designPatterns.StrategyDesignPattern.ClientApp;

import java.util.ArrayList;
import java.util.List;

import designPatterns.StrategyDesignPattern.Application.ECommerceAppication;
import designPatterns.StrategyDesignPattern.Factory.ECommerceFactory;

public class ClientApplication {
	public static void main(String[] args) {
		ECommerceAppication eCommerse = ECommerceFactory.getInstance("BlueDart");
		String[] prodList = {"Highlander-Shirt","Redtape-T-Shirt","Denim-Jeans"};
		double[] prodAmount = {450.50f,899.00f,1250.53f};
		String msg = eCommerse.shopping(prodList, prodAmount);
		System.out.println(msg);
	}
}
