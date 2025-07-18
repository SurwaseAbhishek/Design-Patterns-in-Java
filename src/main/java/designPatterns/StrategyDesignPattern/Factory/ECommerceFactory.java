package designPatterns.StrategyDesignPattern.Factory;

import designPatterns.StrategyDesignPattern.Application.ECommerceAppication;
import designPatterns.StrategyDesignPattern.Couriertype.BlueDart;
import designPatterns.StrategyDesignPattern.Couriertype.Courier;
import designPatterns.StrategyDesignPattern.Couriertype.DTDC;
import designPatterns.StrategyDesignPattern.Couriertype.Delhivery;
import designPatterns.StrategyDesignPattern.Couriertype.ECart;
import designPatterns.StrategyDesignPattern.Couriertype.FedEx;

public class ECommerceFactory {
	
	public static ECommerceAppication getInstance(String type) {
		Courier courier=null;
		if(type.equalsIgnoreCase("BlueDart")){
			courier = new BlueDart();
		}else if(type.equalsIgnoreCase("Delhivery")) {
			courier = new Delhivery();
		}else if(type.equalsIgnoreCase("Ecart")) {
			courier = new ECart();
		}else if(type.equalsIgnoreCase("Fedex")) {
			courier = new FedEx();
		}else if(type.equalsIgnoreCase("Dtdc")) {
			courier = new DTDC();
		}else {
			throw new IllegalArgumentException("Invalid Argumemnts !!! ");
		}
		
		ECommerceAppication eCommerse = new ECommerceAppication();
		eCommerse.setCourier(courier);
		return eCommerse;
	}
}
