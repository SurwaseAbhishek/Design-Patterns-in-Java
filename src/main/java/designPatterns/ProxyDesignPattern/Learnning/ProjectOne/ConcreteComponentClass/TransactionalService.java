package designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ConcreteComponentClass;

import designPatterns.ProxyDesignPattern.Learnning.ProjectOne.ComponentInterface.BankService;
//ConcreteComponentClass
public class TransactionalService implements BankService {

	public TransactionalService() {
		System.out.println("TransactionalService.Constructor() 0-Paramater");
	}//TransactionalService -Constructor

	@Override
	public String withdraw(int accNo, double amount) {
		return "From Account : "+accNo+" - > "+amount+" This amount is deducted";
	}//withdraw

}//TransactionalService
