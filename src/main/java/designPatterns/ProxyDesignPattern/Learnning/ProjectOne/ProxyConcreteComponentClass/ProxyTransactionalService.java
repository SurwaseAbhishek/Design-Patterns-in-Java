package designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ProxyConcreteComponentClass;

import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ComponentInterface.BankService;
import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ConcreteComponentClass.TransactionalService;

public class ProxyTransactionalService implements BankService {
	BankService service=null;
	public ProxyTransactionalService() {
		service = new TransactionalService();
	}//Constructor 0-Param
	
	public String withdraw(int accNo,double amount) {
		if(amount>4000) {
			return "This period is of demonitization you can not withdraw "+amount+" From Acoount : "+accNo;
		}//if
		return service.withdraw(accNo, amount);
	}//withdraw
}//ProxyTransactionalService
