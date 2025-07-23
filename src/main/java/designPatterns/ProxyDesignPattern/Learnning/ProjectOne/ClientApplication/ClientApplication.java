package designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ClientApplication;

import java.util.Date;


import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ComponentInterface.BankService;
import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.FactoryClass.FactoryClass;

public class ClientApplication {
	public static void main(String[] args) {
	

		BankService service = FactoryClass.getInstance(true);
		System.out.println(service.withdraw(123456789, 50000));
	}
}
