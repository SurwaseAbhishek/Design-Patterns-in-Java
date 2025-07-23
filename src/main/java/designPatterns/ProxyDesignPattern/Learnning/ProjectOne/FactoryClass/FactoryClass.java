package designPatterns.ProxyDesignPattern.Learnning.ProjectOne.FactoryClass;

import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ComponentInterface.BankService;
import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ConcreteComponentClass.TransactionalService;
import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ProxyConcreteComponentClass.ProxyTransactionalService;
//FactoryClass
public class FactoryClass {
	public static BankService getInstance(boolean isDemonitization) {
		BankService service=null;
		if(isDemonitization) {
			service = new ProxyTransactionalService();
		}//if
		else {
			service = new TransactionalService();
		}//else
		return service;
	}//getInstance
}//FactoryClass
