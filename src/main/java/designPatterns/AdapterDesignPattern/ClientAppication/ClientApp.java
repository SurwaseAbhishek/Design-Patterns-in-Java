package designPatterns.AdapterDesignPattern.ClientAppication;

import designPatterns.AdapterDesignPattern.ServiceClass.Temperature;
import designPatterns.AdapterDesignPattern.ServiceClass.TemperatureImpl;

public class ClientApp {
	public static void main(String[] args) {
		Temperature temp = new TemperatureImpl();
		System.out.println(temp.getTempratureByCity("Satara"));
	}
}
